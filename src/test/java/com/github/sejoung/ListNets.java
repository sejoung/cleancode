package com.github.sejoung;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class ListNets {

	public static void main(String args[]) throws SocketException {
		Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
		for (NetworkInterface netint : Collections.list(nets)) {
			displayInterfaceInformation(netint);
		}
	}

	static void displayInterfaceInformation(NetworkInterface netint) {

		Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
		for (InetAddress inetAddress : Collections.list(inetAddresses)) {
			if (!inetAddress.isLoopbackAddress() && !inetAddress.getHostAddress().contains(":")
					&& inetAddress instanceof Inet4Address) {
				System.out.printf("Display name: %s\n", netint.getDisplayName());
				System.out.printf("Name: %s\n", netint.getName());
				System.out.printf("getHostAddress: %s - %s\n", inetAddress.getHostAddress(),parserMac(inetAddress.getAddress()));

			}

		}
		System.out.printf("\n");
	}

	static String parserMac(byte[] mac) {
		String macAddress = "";

		for (byte b : mac) {
			macAddress += String.format("%02X", b);
		}
		return macAddress;
	}
}
