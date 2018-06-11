package com.java.test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.test.model.Employee;

public class StreamGroupBy {
	public static void main(String[] args) {
		StreamGroupBy mainClass = new StreamGroupBy();
		List<Employee> employeeList = mainClass.getEmployeeList();
		Map<String, DoubleSummaryStatistics> collected = employeeList.stream().collect(Collectors.groupingBy(t -> t.getLocation()
				, Collectors.summarizingDouble(t -> t.getSalary())));
		collected.entrySet().forEach(t -> System.out.println(t.getKey() + " " + t.getValue().getAverage()));
	}
	
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Amit", 12000.00, "Kolkata"));
		employeeList.add(new Employee(2, "Riddhiman", 10000.00, "Bangalore"));
		employeeList.add(new Employee(3, "Sudipa", 15000.00, "Bangalore"));
		employeeList.add(new Employee(3, "Ajit", 10000.00, "Kolkata"));
		return employeeList; 
	}
}
