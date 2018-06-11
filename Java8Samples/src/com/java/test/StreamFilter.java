package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("India", "Indonesia", "Ireland", "England");
		Map<String, Integer> collected = strings.stream().filter(a -> a.startsWith("I")).collect(Collectors.toMap( t -> t, v-> v.length()));
		System.out.println("Map collector : " + collected);
		long count = strings.stream().filter(a -> a.startsWith("I")).count();
		System.out.println("Filtered elements count : " + count);
	}
}
