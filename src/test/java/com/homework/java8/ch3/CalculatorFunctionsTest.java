package com.homework.java8.ch3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * 
 * @author suresh
 */
public class CalculatorFunctionsTest {

	@Test
	public void testMathFunction1() {
		assertThat(CalculatorFunctions.fun_add.compute(1, 2)).isEqualTo(3);
	}
	
	@Test
	public void testMathFunction2() {
		assertThat(CalculatorFunctions.fun_sub.compute(2, 1)).isEqualTo(1);
		assertThat(CalculatorFunctions.fun_sub.compute(1, 2)).isEqualTo(-1);
	}
	
	@Test
	public void testMathFunction3() {
		assertThat(CalculatorFunctions.fun_mul.compute(1, 2)).isEqualTo(2);
	}
	
	@Test
	public void testMathFunction4() {
		assertThat(CalculatorFunctions.fun_dev.compute(2, 1)).isEqualTo(2);
		assertThat(CalculatorFunctions.fun_dev.compute(2, 0)).isEqualTo(0);
		assertThat(CalculatorFunctions.fun_dev.compute(1, 2)).isEqualTo(0.5);
	}
}