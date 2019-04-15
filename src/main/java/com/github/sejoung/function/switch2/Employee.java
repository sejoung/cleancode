package com.github.sejoung.function.switch2;

import com.github.sejoung.function.switch1.Money;

public abstract class Employee {
	public abstract boolean isPayday();
	public abstract Money calculatePay();
	public abstract void deliverPay(Money pay);
}
