package com.github.sejoung.function.switch1;

public class Patroll {

	private final static int COMMISSIONED = 1;

	private final static int HOURLY = 2;

	private final static int SALARIED = 3;


	public Money calculatePay(Employee e) throws InvalidEmployeeTypeException {
		switch (e.type) {

			case COMMISSIONED:
				return calculateCommissionedPay(e);
			case HOURLY:
				return calculateHourlyPay(e);
			case SALARIED:
				return calculateSalariedPay(e);

			default:
				throw new InvalidEmployeeTypeException(e.type);
		}
	}


	private Money calculateCommissionedPay(Employee e) {
		return new Money();
	}


	private Money calculateHourlyPay(Employee e) {
		return new Money();
	}


	private Money calculateSalariedPay(Employee e) {
		return new Money();
	}

}
