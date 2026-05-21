package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter"+i+" index value : ");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		System.out.println(Arrays.toString(arr));

	}

}
