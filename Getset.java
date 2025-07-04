package com.oops.encapsulation;

class Employee {
	private int empId;
	private String empName;
	private double salary;

	public void setId(int empId) {
		this.empId = empId;
	}

	public void getId() {
		System.out.println("Employee Id: " + empId);
	}

	public void setName(String empName) {
		this.empName = empName;
	}

	public void getName() {
		System.out.println("Employee Name: " + empName);
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void getSalary() {
		if (salary < 10000) {

			System.out.println("Salary is Less." + salary);

		} else {
			System.out.println("Employee Salary: " + salary);
		}

	}
}

public class Getset {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("vaishuu");
		e.setSalary(10000);

		e.getId();
		e.getName();
		e.getSalary();
	}
}