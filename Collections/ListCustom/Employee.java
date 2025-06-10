package com.raju.listcustom;

public class Employee {
	
	private String employeeName;
	private int employeeId;
	private String city;
	private String department;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, int employeeId, String city, String department, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.city = city;
		this.department = department;
		this.salary = salary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", city=" + city
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
