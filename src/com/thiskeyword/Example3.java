package com.thiskeyword;

public class Example3 {

	private String empName;
	private String empDesg;
	private String empAdress;
	private double empSalary;

	// getters

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public String getEmpAdress() {
		return empAdress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	// setters

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void displayData() {
		System.out.println("employee Name : "+this.empName);
		System.out.println("employee Desg : "+this.empDesg);
		System.out.println("employee Adress : "+this.empAdress);
		System.out.println("employee Salary : "+this.empSalary);
	}

}
