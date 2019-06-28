package com.jeongsik.calculator;

public class Calculator {
	
	public Calculator() {
		System.out.println("Created an instance!");
	}
	
	public int add(int lhs, int rhs) {
		return lhs + rhs;
	}
	
	public int minus(int lhs, int rhs) {
		return lhs - rhs;
	}
	
	public int multiply(int lhs, int rhs) {
		return lhs * rhs;
	}
	
	public int divide(int lhs, int rhs) {
		return lhs / rhs;
	}

}