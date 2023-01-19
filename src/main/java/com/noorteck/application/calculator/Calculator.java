package com.noorteck.application.calculator;

public class Calculator {

	public int add(int num1, int num2) {

		return num1 + num2;

	}

	public int subtract(int num1, int num2) {

		return num1 - num2;

	}

	public int division(int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}

		return num1 / num2;

	}
	
	
	public int multiplication(int num1, int num2) {

		return num1 * num2;

	}

}
