package com.Exception.test;

public class Example1 {

	public static void main(String[] args) {
//	    RuntimeException th=new ArithmeticException("/ by Zero ");
//	    System.out.println(th.getMessage());
		
		try {
			int i=100/0;//     new AerthamaticeEcption("/ by Zero")
			
		} catch (Throwable e) {// RuntimeExcption e=new Aerthamtic("/ by zero")
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Hello There");

	}

}
