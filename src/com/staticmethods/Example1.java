package com.staticmethods;

/**
 * 
 * 
 * 
 * write a java program to find the sum of two numbers using arguments and
 * parameters 10 20->30
 */

public class Example1 {

//	public static void kitchen() {
//		System.out.println("Preparing lunch");// 1
//
//		order();
//		System.out.println("completed lunch");// 4
//	}
//
//	public static void order() {
//		System.out.println("Dispached");// 2
//		System.out.println("order receved");// 3
//	}

//	public static void displayData(int a,int b,int c) {
//		System.out.println(a+b+c);
//		printData(a+b, c+a);
//		
//	}
//	public static void printData(int d,int e) {
//		System.out.println(d+e);
//	}
	
	public static void getData(int a, String name) {
		System.out.println(a+name);
	}
	
	
	
	public static void main(String[] args) {
		getData(34, "Java is awesome");
		
	}

}
