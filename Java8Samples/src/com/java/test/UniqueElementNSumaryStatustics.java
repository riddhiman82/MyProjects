package com.java.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElementNSumaryStatustics {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 2, 3, 2, 1);
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		List<Integer> uniqueList = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Unique element list : " + uniqueList);
		IntSummaryStatistics summaryStatistics = uniqueList.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Average : " + summaryStatistics.getAverage());
		System.out.println("Min : " + summaryStatistics.getMin());
		System.out.println("Max : " + summaryStatistics.getMax());
		System.out.println("Sum : " + summaryStatistics.getSum());
	}
}
