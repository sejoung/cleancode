package com.github.sejoung.function.order;

public abstract class Sample {

	public abstract boolean attributeExist(String attribute);
	public abstract void setAttribute(String attribute, String value);
	public abstract boolean set(String attribute, String value);

	public void run() {
		if (set("username", "unclebob")) {
		}
		if (attributeExist("username")) {
			setAttribute("username", "unclebob");
		}
	}
}