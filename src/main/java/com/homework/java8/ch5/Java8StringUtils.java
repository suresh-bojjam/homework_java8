/**
 * 
 */
package com.homework.java8.ch5;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * @author suresh
 *
 */
public class Java8StringUtils {
	
	public String joiner(String str1, String str2) {
		return null;
	}
	
	public String joiner(String str1, String prefix, String suffix) {
		return null;
	}

	/**
	 * 
	 * @param list list of strings.
	 * @param delimiter delimiter to combine the strings.
	 * @return combined string with delimiter.
	 */
	public String joiner(List<String> list, String delimiter) {
		return String.join(delimiter, list)+".";
	}
	
	/**
	 * 
	 * @param list list of strings.
	 * @param prefix prefix to combine the strings.
	 * @param suffix suffix to combine the strings.
	 * @param delimiter delimiter to combine the strings.
	 * @return 
	 */
	public String joiner(List<String> list, String prefix, String suffix, String delimiter) {
		StringJoiner stringJoiner = new StringJoiner(delimiter, prefix, suffix);
		
		if(list.size()>=3) {
			IntStream.range(0, list.size()).mapToObj(i ->i==list.size()-1?stringJoiner.add("&"+list.get(i)):stringJoiner.add(list.get(i)));
		}
		else
			list.forEach(each->stringJoiner.add(each));
		return stringJoiner.toString()+".";
	}
	
	public static void main(String[] args) {
		//System.out.println(new Java8StringUtils().joiner(Arrays.asList("one","two","three"), ","));
		System.out.println(new Java8StringUtils().joiner(Arrays.asList("one","two","three","four"), "'","'","','"));
	}
}