package com.arrays;

import java.util.Scanner;

public interface Utilityclass {

	public static int[] toarray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ize of an array : ");
		int size = sc.nextInt();
		if (size < 1) {
			return null;
		} else {
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter " + i + " index value :");
				arr[i] = sc.nextInt();
			}
			return arr;
		}
	}

}
