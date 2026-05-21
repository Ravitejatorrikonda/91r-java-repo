package com.arrays;

public class Example7 {
	public static boolean palindrome(int num) {
		int temp=num;
		int rev=0;
		while(num !=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		
		return temp==rev;
		
	}

	public static void main(String[] args) {
	  int[] arr1=Utilityclass.toarray();
	  for(int i: arr1) {
		if(palindrome(i)) {
			System.out.println(i);
		}
	  }

	}

}
