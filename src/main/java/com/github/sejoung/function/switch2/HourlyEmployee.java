package com.github.sejoung.function.switch2;

import com.github.sejoung.function.switch1.Money;

public class HourlyEmployee extends Employee {

	public boolean isPayday() {
		return false;
	}

	public Money calculatePay() {
		return null;
	}

	public void deliverPay(Money pay) {

	}
}
