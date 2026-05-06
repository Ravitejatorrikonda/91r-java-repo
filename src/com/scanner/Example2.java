package com.scanner;

import java.util.Scanner;

/**
 * 
 * Write a java program to find the eligibility of marrage
 * 
 * gander="female" age =23 eligible of marr
 * 
 * gender=Male age 25 above eligible
 * 
 * not eligible
 * 
 */

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender : ");
		String gender = sc.nextLine();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		
		if((gender.equals("female") && age ==23) || (gender.equals("male") && age >= 25)) {
			System.out.println("Eligible");
		}else {
			System.out.println("! eligible");
		}
		
		
		sc.close();

	}

}
