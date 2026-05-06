package com.controlstatements;

public class Example3 {
/**
 * Write a java program to find the given n umber is neon number or not?
 * 
 * int num=5;  9*9=81->9
 * 
 * 
 * 
 * 
 */
	
	public boolean isNeonNumber(int num) {
		int square=num*num;
		int sum=0;//9
		while(square !=0) {
			
			//   1+   8
			sum=sum+square%10;
			square /=10;//0
		}
		return sum==num;
	}
	
	
	
	public static void print(int base, int power) {
		int result=1;//8
		for(int i=1;i<=power;i++) {
			result=result *base;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
//      System.out.println(new Example3().isNeonNumber(5)?"Neon":"! Neon");
//		Example3 obj=new Example3();
//		for(int i=1; i<=100;i++) {
//			if(obj.isNeonNumber(i)) {
//				System.out.println(i);
//			}
//		}
		
		
		print(2, 3);
		
		

	}

}
