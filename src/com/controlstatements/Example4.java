package com.controlstatements;

/**
 * Write a java progran=m given number is amstrong number or not
 * 
 * num=153->
 * 
 * 3 1+125+27=153
 * 
 * 25->2 4+25=29
 * 
 * power count sum
 * 
 * 
 * 
 * 
 */
public class Example4 {
//power                      1          3
	public int getPower(int base, int exp) {
		int power = 1;//125
		for (int i = 1; i <= exp; i++) {
			power = power * base;
		}
		return power;
	}

	// COUNT

	              //         153
	public int getCount(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;//
		}
		return count;
	}

	public boolean isAmstrong(int num) {
		   //153
		int temp = num;
		int sum = 0;//153
		       
		//    3
		int count = getCount(num);
		
		while (num != 0) {
			//   1->1
			int base = num % 10;
			                //    1        3
			sum = sum + getPower(base, count);
			 //    152+    1
			num /= 10;//0
		}
		return temp == sum;
	}

	public static void main(String[] args) {
		Example4 obj = new Example4();
//		System.out.println(obj.isAmstrong(15)?"Amstrong":"! amstrong");
		
		for (int i = 1; i <= 1000; i++) {
			if(obj.isAmstrong(i)) {
				System.out.println(i);
			}
		}
	}

}
