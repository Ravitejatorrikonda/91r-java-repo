package com.instance;

public class Example1 {
	static String company;
	String empName;
	double Salary;
	
	
	public void print() {
		System.out.println("employee name : "+empName);//abhinay
		System.out.println("Employee salary : "+Salary);//100000.0,0.0
		System.out.println("Companay name : "+company);//dell
	}
	public static void main(String[] args) {
		Example1 obj1=new Example1();
		Example1 obj2=new Example1();
		obj1.company="Dell";
		obj2.empName="Abhinay";
		obj2.Salary=100000.0;
		obj2.print();
		
		
	
	}

}
