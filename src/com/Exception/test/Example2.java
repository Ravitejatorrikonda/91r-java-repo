package com.Exception.test;
//Compiletime errors
//Runtime error/ exceptions

public class Example2 {

	public static void main(String[] args) {
		//Default excption handiler
//		RuntimeException th=new ArithmeticException("arithmetic");
//		System.out.println(th.getMessage());

		
		try {
			int i=100/0;
		} catch (ArithmeticException e) {
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Hellom");
		
//		int i=100/0;
//		System.out.println("i amExcicuted...");
	}

}
