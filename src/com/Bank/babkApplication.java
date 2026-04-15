package com.Bank;

public class babkApplication {
	String customerName;
	String customerAddress;
	long phoneNumber;
	double balance;
	public babkApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
		
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		System.out.println("\"Account Created Successfully\".");
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("please Enter Valid  Amount...");
		}else {
			balance += amount;
			System.out.println("Current Balanace : "+balance);
		}
	}
	public void withdraw(double amount) {
		
		if((amount <= 0)) {
			System.out.println("Invalid withdrawal amount");
		}else if(amount > balance){
			System.out.println("INSUFFICIENT FUNDS");
		}else {
			balance -=amount;
			System.out.println(balance);
		}
	}
	public void showBalance() {
		System.out.println(balance);
	}
	
	

}
