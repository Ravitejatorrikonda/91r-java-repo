package com.controlstatements;

/**
 * 
 * 
 * Write a java program weather the number is prime or not?
 * 
 * num=5->
 * 
 * 
 * 1 (num %1)->0->count 1 2 false-> 3 false-> 4 false-> 5 true->count 2
 * 
 * 
 * 
 */

//First approach , but not recomended.
public class Example5 {

//	public boolean isPrime(int num) {
//		if(num <= 0) {return false;}
//		int count = 0;
//		for (int i = 1; i <= num; i++) {
////			System.out.println(i);
//			if (num % i == 0) {
//				count++;//2
//			}
//
//		}
//		return count==2;
//	}
	
	//second approach
//	public boolean isPrime(int num) {
//		if(num<=0)return false;
//		int count=0;
//		
//		//                   10
//		for (int i = 1; i <=num; i++) {
//			System.out.println(i);
//			//  10%  2==0
//			if(num % i==0) {
//				count++;
//			}
//			if(count >2) {
//				return false;
//			}
//		}
//		return count==2;
//	}
	
//3rd approach	
//	
	public boolean isPrime(int num) {
		if(num <= 0)return false;
		int count=0;
		for (int i = 2; i <= num/2; i++) {
//			System.out.println(i);
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
	 Example5 obj=new Example5();
//	System.out.println( obj.isPrime(10));
	 for (int i = 2; i <= 1000; i++) {
		if(obj.isPrime(i)) {
			System.out.println(i);
		}
	}

	}

}
