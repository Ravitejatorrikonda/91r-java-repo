package com.Bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter Adress : ");
		String adress=sc.nextLine();
		
		System.out.println("Enter Phone Number : ");
		long phoneNumber=sc.nextLong();
		
		System.out.println("Enter Balance : ");
		double balance=sc.nextDouble();
		
		
		babkApplication obj=new babkApplication(name, adress, phoneNumber, balance);
		
		
		boolean result=true;
		while (result) {
			System.out.println("**** Select an Option from Below ****\r\n"
					+ "1. Withdraw\r\n"
					+ "2. Deposit\r\n"
					+ "3. Show Balance\r\n"
					+ "4. Exit\r\n"
					+ "Enter your option [1-4]:\r\n"
					+ "");
			int option=sc.nextInt();
			switch (option) {
			case 1: {
				  System.out.println("Enter withdraw ammount : ");
				  double amount=sc.nextDouble();
				  obj.withdraw(amount);
				  break;
				
			}
			case 2: {
				System.out.println("Enter deposit ammount : ");
				double amount=sc.nextDouble();
				obj.deposit(amount);
				break;
			}
			case 3: {
			   obj.showBalance();
			   
			   break;
			   }
			case 4: {
				System.out.println("Thank You!");
				result=false;
				break;
			}
			default:
				System.out.println("Invalid option");
			}
			
		}
		
		
		
		sc.close();

	}

}
