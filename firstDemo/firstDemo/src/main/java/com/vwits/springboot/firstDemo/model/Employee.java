package com.vwits.springboot.firstDemo.model;

public class Employee {
	private int EmpId;
	private String EmpName;
	private double Salary;
	public Employee(int empId, String empName, double salary) {
		super();
		EmpId = empId;
		EmpName = empName;
		Salary = salary;
	}
	public Employee() {
		System.out.println("Employee bean created...");
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Salary=" + Salary + "]";
	}
	@Override
	public boolean equals(Object obj) {
		return ((Employee)obj).EmpId == this.EmpId;
	}
}
