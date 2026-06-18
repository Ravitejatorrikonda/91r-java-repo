package com.Exception.test;

public class Example10 {

	public void order() throws Exception {
		throw new Exception("this is Exception");
	}

	public static int getData() {
		try {
			return 100;
		} finally {
			return 200;
		}
	}

	public void printData(){
		try {
			try {
				throw new RuntimeException("runtime");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			System.out.println("this is finally");
		}
	}

	public static void main(String[] args) {
		new Example10().printData();
		System.out.println(getData());
		try {
			new Example10().order();// new Exception("this is Exception);
			System.out.println("this is try block.....");
		} catch (Exception e) {
			System.out.println("this is Catch block");
		} finally {
			System.out.println("this is finally block...");
		}
	}

}
