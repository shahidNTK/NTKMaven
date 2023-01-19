package com.noorteck.test.calculator;

import org.junit.Test;

import com.noorteck.application.calculator.Calculator;

import junit.framework.Assert;

public class CalculatorTest {
	@Test
	public void addTest() {

		Calculator obj = new Calculator();
		int result = obj.add(2, 3);

		Assert.assertEquals(5, result);

	}
	
	@Test
	public void subtractTest() {
		
		Calculator obj = new Calculator();
		int result = obj.subtract(2, 3);
		Assert.assertEquals(-1, result);
		
	}

}
