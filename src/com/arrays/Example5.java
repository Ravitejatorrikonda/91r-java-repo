package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = Integer.parseInt(sc.nextLine());
		
		if(size < 1 && size > 10) {
			System.out.println("Invalid size .....");
		}else {
			String[] arr = new String[size];
		
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter" + i + " index value : ");
				arr[i] = sc.nextLine();
			}
			
			System.out.println(Arrays.toString(arr));
		}
		
		
		

	}

}
