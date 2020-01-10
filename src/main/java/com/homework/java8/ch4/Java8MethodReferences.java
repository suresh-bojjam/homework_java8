package com.homework.java8.ch4;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8MethodReferences {

	/**
	 * 
	 */
	private static final Function<List<Integer>,Integer> maxVal = Collections::max;

	private static final BiFunction<String, String, String> concate = String::concat;
	
	/**
	 * 
	 * @param integers list of integer values.
	 * @return max value of the list.
	 */
	public Integer findMax(List<Integer> integers){
		return maxVal.apply(integers);
	}

	/**
	 * 
	 * @param list list of strings
	 * @return string combined with the delimiter
	 */
	public String addDelemetor(List<String> list) {
		Stream<String> stream = list.stream();
		//TODO :: last word should add prefix with & and suffix with dot.
		return stream.reduce("",(first,second)->concate.apply(first, second+", "));
	}

	
	public static void main(String args[]) {
		System.out.println(new Java8MethodReferences().addDelemetor(Arrays.asList("one","two","three")));
	}
}