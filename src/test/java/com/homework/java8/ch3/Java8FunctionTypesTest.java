/**
 * 
 */
package com.homework.java8.ch3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * @author suresh
 *
 */
public class Java8FunctionTypesTest {
	
	private static final Java8FunctionTypes java8FunctionTypes = new Java8FunctionTypes();
	
	@Test
	public void testToUpperCase() {
		String name = "james";
		assertThat(name.toUpperCase()).isEqualTo(java8FunctionTypes.toUppercase(name));
	}
	
	@Test
	public void testValidateName() {
		String name1 = "james";
		assertThat(false).isEqualTo(java8FunctionTypes.validateName(name1));
		String name2 = "james cameron";
		assertThat(true).isEqualTo(java8FunctionTypes.validateName(name2));
	}

	@Test
	public void testSendNotification() {
		String message = "hello world";
		java8FunctionTypes.sendNotification(message);
	}
	
	@Test
	public void testGenerateId(){
		assertThat(java8FunctionTypes.generateId()).isNotNull();
	}
}