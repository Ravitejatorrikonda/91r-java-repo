package com.arrays;

public class Example2 {

	public static void main(String[] args) {
		int [] arr=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=1+i;
		}
		System.out.println("array first index value : "+arr[0]);
		System.out.println("array sec index value : "+arr[1]);
		System.out.println("array thi index value : "+arr[2]);
		System.out.println("array four index value : "+arr[3]);
		System.out.println("array five index value : "+arr[4]);

	}

}
