package com.github.sejoung.function.switch2;

import com.github.sejoung.function.switch1.InvalidEmployeeTypeException;

public interface EmployeeFactory {
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeTypeException;
}
