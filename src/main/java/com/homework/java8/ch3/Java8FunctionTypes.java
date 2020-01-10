/**
 * 
 */
package com.homework.java8.ch3;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/**
 * @author suresh
 *
 */
public class Java8FunctionTypes {
	
	/*
	 * Java8 has different type of functions
	 * 1. predicates - takes the input and validate with test condition and returns the result. 
	 * 2. consumer - takes the input and perform the defined action but doesn't return any value
	 * 3. function - takes the function as input, perform the action and returns the result 
	 * 4. supplier - doesn't take any input params but produces the output.
	 * */

	/**
	 * Predicate function to validate condition.
	 */
	private static final Predicate<String> namePredicate = name -> { 
		if(name==null) return false;
		if(name.isEmpty()) return false;
		if(name.length()<6) return false;
		return true;
	};
	
	/**
	 * consumer function to print message
	 */
	private static final Consumer<String> audit = message -> System.out.println(message);
	
	/**
	 * function to uppercase the name.
	 */
	private static final Function<String,String> fun_toUppercase = name -> name.toUpperCase();
	
	private static final Supplier<String> uuidGenerator = ()-> UUID.randomUUID().toString();
	
	/**
	 * Predicate function to validate the name.
	 * @param str name of the user
	 * @return true if passed the all validations.
	 */
	public boolean validateName(String str) {
		return namePredicate.test(str);
	}
	
	/**
	 * consumer example
	 * @param str notification message.
	 */
	public void sendNotification(String message) {
		audit.accept(message);
		//TODO :: send mail notification and audit the message before sending the mail notification.
	}
	
	/**
	 * 
	 * @param str input string.
	 * @return string in upper case.
	 */
	public String toUppercase(String str) {
		return fun_toUppercase.apply(str);
	}

	/**
	 * 
	 * @return UUID string
	 */
	public String generateId() {
		return uuidGenerator.get();
	}
}