package com.scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Example3 obj=new Example3();
//		obj.getData();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Name : ");
	obj.empname=sc.nextLine();
	
	System.out.println("Enter Employee Adress : ");
	obj.empAdress=sc.nextLine();
	
	System.out.println("Enter employee Salary : ");
	obj.empSalry=sc.nextDouble();
	
	System.out.println("Enter Employee Id : ");
	obj.empId=sc.nextInt();
	
	obj.getData();
	
	
	
	sc.close();

	}

	
	/**
	 * 
	 * username=abcd123
	 * password=12345
	 * 
	 * 
	 * 
	 * 
	 */
}
