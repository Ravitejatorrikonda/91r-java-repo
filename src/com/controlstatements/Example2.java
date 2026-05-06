package com.controlstatements;

public class Example2 {
	
	

	public static void main(String[] args) {
	
		int num=1234;
		int temp=num;
		int rev=0;//4321
		while(num !=0) {
			//    4320+1
			rev=rev*10+num %10;
			num /=10;//0
		}
		System.out.println((temp==rev)?"palindrome":"! a palindrome");

	}

}
