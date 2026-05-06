package com.Employee;

public class Employee {

	private String empName, empDesg, empAdress, empStreet;
	private double salary;

	public Employee(String empName, String empDesg, String empAdress, String empStreet, double salary) {
		this.empName = empName;
		this.empDesg = empDesg;
		this.empAdress=empAdress;
		this.empStreet=empStreet;
		this.salary=salary;
		
		System.out.println("Employee Object created");

	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public String getEmpAdress() {
		return empAdress;
	}

	public String getEmpStreet() {
		return empStreet;
	}
	
	public double getSalary() {
		return salary;
	}

	
	//setters
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}

	public void setEmpStreet(String empStreet) {
		this.empStreet = empStreet;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
	public void updatedSalary(double salary) {
		if(salary <= 0) {
			System.out.println("this is invalid salary to update.....");
		}else {
			this.salary +=salary;
			
		}
	}
	
	
	
	

}
