package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println(Arrays.toString(arr));
		
		
		
		sc.close();

	}

}
