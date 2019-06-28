package com.jeongsik.calculator;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCalculator {
	
	private final Calculator calculator = new Calculator();	

	@Test
	void testCalculator() {
		assertNotNull(calculator);
	}

	@Test
	void testAdd() {
		assertEquals(calculator.add(1, 2), 3);
	}

	@Test
	void testMinus() {
		assertEquals(calculator.minus(1, 1), 0);
	}

	@Test
	void testMultiply() {
		assertEquals(calculator.multiply(2, 3), 6);
	}

	@Test
	void testDivide() {
		assertEquals(calculator.divide(6, 3), 2);
	}

}
