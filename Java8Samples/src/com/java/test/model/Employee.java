package com.java.test.model;

public class Employee {
	private Integer empId;
	private String name;
	private Double salary;
	private String location;

	public Employee(Integer empId, String name, Double salary, String location) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}
}
