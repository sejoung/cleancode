package com.github.sejoung.function.switch2;

		import com.github.sejoung.function.switch1.InvalidEmployeeTypeException;

public class EmployeeFactoryImpl implements EmployeeFactory {

	private final static int COMMISSIONED = 1;

	private final static int HOURLY = 2;

	private final static int SALARIED = 3;


	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeTypeException {
		switch (r.type) {
			case COMMISSIONED:
				return new CommissionedEmployee();
			case HOURLY:
				return new HourlyEmployee();
			case SALARIED:
				return new SalariedEmployee();
			default:
				throw new InvalidEmployeeTypeException(r.type);
		}
	}

}
