package com.scanner;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter employee ID : ");
		int id=sc.nextInt();
		System.out.println("Employee Name : "+name);
		System.out.println("Employee ID : "+id);
		
		
		
		
		sc.close();

	}

}
