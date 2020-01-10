/**
 * 
 */
package com.homework.java8.ch1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.common.primitives.Ints;

/**
 * @author suresh
 *
 */
public abstract class Utils {

	/**
	 * Returns the max value of array
	 * 
	 * @param array of integer's 
	 * @return maximum value of array {@link OptionalInt}
	 */
	public static OptionalInt maxOfArray(int[] arr) {
		return Arrays.stream(arr).max();
	}
	
	/**
	 * Returns the minimum of array.
	 * 
	 * @param arr
	 * @return ({@link OptionalInt}
	 */
	public static OptionalInt minOfArray(int[] arr) {
		return Arrays.stream(arr).min();
	}
	
	/**
	 * Returns the average of array.
	 * 
	 * @param arr
	 * @return {@link OptionalDouble}
	 */
	public static OptionalDouble avgOfArrray(int[] arr) {
		return Arrays.stream(arr).average();
	}
	
	
	/**
	 * Returns the sum of array.
	 * 
	 * @param arr array of integers.
	 * @return integer the sum of integers.
	 */
	public static int sumOfArray(int[] arr) {
		return Arrays.stream(arr).sum();
	}

	/**
	 * Returns the sum of integers list.
	 * 
	 * @param arr list of integers.
	 * @return integer sum of integers list.
	 */
	public static int sumOfList(List<Integer> arr) {
		return arr.stream().mapToInt(ele->ele).sum();
	}
	
	/**
	 * Returns the count of occurrences of the given integer value.
	 * @param arr array of integer values
	 * @return integer count of value occurrences.
	 */
	public static long countOfOccurrences(int[] arr, int ele) {
		return Arrays
			.stream(arr)
			.filter(val-> val == ele)
			.count();
	}
	
	/**
	 * Returns the list of distinct array.
	 * 
	 * @param arr array of integers.
	 * @return arr array of distinct integers.
	 */
	public static int[] distinctValuesOfArray(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}
	
	/**
	 * 
	 * @param <T>
	 * @param <R>
	 * @param arr
	 * @param func
	 * @return map with list of items arranged group by given func 
	 */
	public static <T,R> Map<R,List<T>> groupBy(T[] arr, Function<T,R> func){
		return Arrays.stream(arr).collect(Collectors.groupingBy(func));
	}
	
	/**
	 * 
	 * @param elements list of integers.
	 * @param ele element to match
	 * @return returns the first occurrence of element.
	 */
	public static int indexOf(int[] elements, int ele) {
		return IntStream.range(0, elements.length)
		.filter(i->elements[i]==ele)
		.findFirst()
		.orElse(-1);
	}

	
	/**
	 * 
	 * @param arr array of integer values.
	 * @return sum of array of integer values.
	 */
	public static int sumOfArrayByReduceFunction(int[] arr) {
		//IntStream.range(0, arr.length)
		//.reduce(0,(acc,val)->val>0?val:0)
		return 0;
	}
	
	/**
	 * 
	 * @param list list of strings
	 * @return returns the longest string from given list.
	 */
	public static String findLongestString(List<String> list) {
		Optional<String> longestString = list.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
		return longestString.get();
	}
	
	/**
	 * 
	 * @param list list of strings
	 * @return string returns the combined string.
	 */
	public static Optional<String> joinStrings(List<String> list,String separator) {
		if(Objects.isNull(separator) || separator.isEmpty()) {
			return list.stream().reduce((str1,str2)->(str1+","+str2));
		}else {
			return list.stream().reduce((str1,str2)->(str1+separator+str2));
		}
	}
	
	/**
	 * 
	 * @param list list of strings.
	 * @return returns the string combined by a separator
	 */
	public static Optional<String> join(List<String> list) {
		return list.stream().reduce((obj1,obj2)->obj1+"-"+obj2);
	}
	
	
	/**
	 * 
	 * @param integers list of integers.
	 * @return the sum of integers.
	 */
	public static int sumByReduce(int[] integers) {
		//return sumByReduce(Arrays.stream(integers).boxed().collect(Collectors.toList()));
		return IntStream.range(0, integers.length-1).reduce(0,(subtotal,element)->subtotal+element);
	}
	
	/**
	 * 
	 * @param list list of integers.
	 * @return sum of the integers.
	 */
	public static int sumByReduce(List<Integer> list) {
		return list.stream().reduce(0,(subtotal,element)->subtotal+element);
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
