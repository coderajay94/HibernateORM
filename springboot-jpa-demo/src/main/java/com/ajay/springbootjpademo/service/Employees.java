package com.ajay.springbootjpademo.service;

public class Employees {

	private int empId;
	private String employeeName;
	private int age;
	private String gender;
	private String role;
	private int datejoined;
	private float salary;

	public Employees(int empId, String employeeName, int age, String gender, String role, int datejoined,
			float salary) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.age = age;
		this.gender = gender;
		this.role = role;
		this.datejoined = datejoined;
		this.salary = salary;
	}

	public Employees() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getDatejoined() {
		return datejoined;
	}

	public void setDatejoined(int datejoined) {
		this.datejoined = datejoined;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", employeeName=" + employeeName + ", age=" + age + ", gender=" + gender
				+ ", role=" + role + ", datejoined=" + datejoined + ", salary=" + salary + "]";
	}
	
	

}
