package com.arrays;

public class Example1 {

	public static void main(String[] args) {
	//datatype [] arr=new datatype[size];
		
		int[] arr=new int[5];
		System.out.println("array first index value : "+arr[0]);
		System.out.println("array sec index value : "+arr[1]);
		System.out.println("array thi index value : "+arr[2]);
		System.out.println("array four index value : "+arr[3]);
		System.out.println("array five index value : "+arr[4]);
		System.out.println("-------------------------------------");
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println("array first index value : "+arr[0]);
		System.out.println("array sec index value : "+arr[1]);
		System.out.println("array thi index value : "+arr[2]);
		System.out.println("array four index value : "+arr[3]);
		System.out.println("array five index value : "+arr[4]);
		
		System.out.println(arr.length);
		
		
		
		

	}

}
