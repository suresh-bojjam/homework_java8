package com.homework.java8.ch3;

public class CalculatorFunctions {

	@FunctionalInterface 
	interface MathFunction {
		/*
		 * Implementation notes:
		 * MathFunction need not to be a FunctionalInterface
		 * as per design MathFunction should have only one function to enforce the same we need to use the @FuntionalInterface
		 * */
		double compute(double x, double y);
	}
	
	static MathFunction fun_add = (double x, double y)->x+y;
	static MathFunction fun_sub = (double x, double y)->x-y;
	static MathFunction fun_mul = (double x, double y)->x*y;
	static MathFunction fun_dev = (double x, double y)->{if(y==0) return 0; else return x/y;};
}