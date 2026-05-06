package com.Employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     System.out.println("Enter empName : ");
      String name=sc.nextLine();
      
      System.out.println("Enter empDesg : ");
      String desg=sc.nextLine();
      
      System.out.println("Enter Emp adxress : ");
      String adress=sc.nextLine();
      
      System.out.println("Enter emp Street : ");
      String street= sc.nextLine();
      
      System.out.println("Enter Salary : ");
      double salary=sc.nextDouble();
		
		Employee emp = new Employee(name, desg, adress, street,salary);
		System.out.println(emp.getEmpDesg());
		
		System.out.println("-------------------");
		
		emp.updatedSalary(10000.0);
		System.out.println("Updated Salary : "+emp.getSalary());
		

		sc.close();

	}

}
