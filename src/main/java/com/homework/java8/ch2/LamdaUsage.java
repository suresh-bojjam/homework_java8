/**
 * 
 */
package com.homework.java8.ch2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * 
 * @author suresh
 *
 */
public class LamdaUsage {

	@FunctionalInterface
	interface Constants{
		double getVal();
	}
	
	private static final Constants PI = ()->3.14;
	
	private static final Constants SUM = ()->3.14;
	
	private static final Function<List<Integer>,Integer> maxVal = (numbers) -> Collections.max(numbers);
	
	/**
	 * 
	 * @param integers list of integers.
	 * @return max value of the list.
	 */
	public Integer maxValOf(List<Integer> integers) {
		return maxVal.apply(integers);
	}
	
	/**
	 * 
	 * @param list list of strings.
	 * @return list of sorted strings
	 */
	public List<String> sort(List<String> list){
		Collections.sort(list,(first,second)->first.length()-second.length());
		return list;
	}
	
	/**
	 * lamda with no args
	 */
	public void lamdaWithNoParams() {
		System.out.println("value of PI: "+PI.getVal());
	}
	
	/**
	 * lamda with one argument
	 * @param list list of strings
	 */
	public void lambdaWithOneParams(List<Object> list) {
		list.stream().forEach((each)->System.out.print(each));
	}
	
	/**
	 * lambda with mulitple arguments
	 * @param map map with key and value map.
	 */
	public void lambdaWithMultiParams(Map<String,Object> map) {
		map.forEach((key,val)->System.out.print("key: "+key+", val: "+val));
	}
	
	/**
	 * @param integers array of integers
	 */
	public void printEven(int[] integers) {
		IntStream.range(0, integers.length-1).forEach(val->{if(val%2==0)System.out.print(val);});
	}

	
	public <T> void print(List<T> list) {
		if(list.size()>0) {
			String type = list.get(0).getClass().getName();
			if(type.equalsIgnoreCase(javax.lang.model.type.TypeKind.ARRAY.name())) {

			}else if(type.equalsIgnoreCase(javax.lang.model.type.TypeKind.INT.name()) || type.equalsIgnoreCase("INTEGER")) {

			}else if(type.equalsIgnoreCase(javax.lang.model.type.TypeKind.LONG.name())) {

			}else if(type.equalsIgnoreCase(javax.lang.model.type.TypeKind.FLOAT.name())) {

			}else if(type.equalsIgnoreCase(javax.lang.model.type.TypeKind.DOUBLE.name())) {

			}else if(type instanceof String) {

			}else { //type can be any Object

			}
		}
	}

	public static void main(String args[]) {
		
		System.out.println(PI.getVal());
		System.out.println(SUM.getVal());
		/*
		String str="";
		System.out.println("name: "+str.getClass().getName());
		System.out.println("simple name: "+str.getClass().getSimpleName());
		System.out.println("type name: "+str.getClass().getTypeName());
		System.out.println("canonical name: "+str.getClass().getCanonicalName());

		int val=0;
		Object o=val;
		System.out.println("name: "+o.getClass().getName());
		System.out.println("simple name: "+o.getClass().getSimpleName());
		System.out.println("type name: "+o.getClass().getTypeName());
		System.out.println("canonical name: "+o.getClass().getCanonicalName());
		*/		
	}
}