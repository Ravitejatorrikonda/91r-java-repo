package com.constructors;

public class Example2 {
	String empName;
	String empDesg;
	int empId;
	double empSalary;

	public Example2(String empName, String empDesg, int empId, double empSalary) {
		this.empName = empName;
		this.empDesg = empDesg;
		this.empId = empId;
		this.empSalary = empSalary;
		System.out.println("Employee Object is Created...");
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public int getEmpId() {
		return empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void getDetails() {
     System.out.println("Employee Name: "+ empName);
     System.out.println("Employee Desg: "+ empDesg);
     System.out.println("Employee Id: "+ empId);
     System.out.println("Employee Name: "+ empSalary);
	}
	
	public void UpdatedSalary(double salary) {
		this.empSalary +=salary;
	}

}
