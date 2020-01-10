/**
 * 
 */
package com.homework.java8.ch1;

//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

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

import org.junit.Test;

/**
 * @author suresh
 *
 */
public class UtilsTest {

		@Test
		public void testLoadContext() {
			System.out.println("loading context successful.");
		}
	
		@Test
		public void testMaxOfArray() {
			OptionalInt max = Utils.maxOfArray(new int[] {1,2,3,4,5});
			assertThat(max.getAsInt()).isEqualTo(5);
		}
		
		@Test
		public void testMinOfArray() {
			OptionalInt min = Utils.minOfArray(new int[] {1,2,3,4,5});
			assertThat(min.getAsInt()).isEqualTo(1);
		}
		
		@Test
		public void testAvgOfArrray() {
			OptionalDouble avg = Utils.avgOfArrray(new int[] {1,2,3,4,5});
			assertThat(avg.getAsDouble()).isEqualTo(3);
		}
		
		@Test
		public void testSumOfArray() {
			int sum = Utils.sumOfArray(new int[] {1,2,3,4,5});
			assertThat(sum).isEqualTo(15);
		}

		@Test
		public void testSumOfList() {
			int sum = Utils.sumOfList(Arrays.asList(1,2,3,4,5));
			assertThat(sum).isEqualTo(15);
		}
		
		@Test
		public void testCountOfOccurrences() {
			long noOfOccurrances = Utils.countOfOccurrences(new int[] {1,3,2,3,4,3,5}, 3);
			assertThat(noOfOccurrances).isEqualTo(3);
		}
		
		@Test
		public void testDistinctValuesOfArray() {
			int[] elements = new int[] {1,2,3,4,5};
			int[] result = Utils.distinctValuesOfArray(new int[] {1,2,3,4,3,5});
			assertThat(result.length).isEqualTo(5);
			assertThat(result).isEqualTo(elements);
		}
		
		
		@Test
		public void testGroupBy(){
			//TODO :: write test case
		}
		
		public void indexOf() {
			/*IntStream.range(0, elements.length)
			.filter(i->elements[i]==ele)
			.findFirst()
			.orElse(-1);*/
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
}