package com.Exception.test;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		try {
			int [] arr=new int[sc.nextInt()];// new Exception()
			System.out.println(arr[100]);

		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		System.out.println("i am exicuted");

	}

}
