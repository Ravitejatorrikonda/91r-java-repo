package com.methodoverloading;

public class Test2 {
	
//	public void printData(int a) {
//		System.out.println("int");
//	}
	
	public void printData(byte a) {
		System.out.println("Byte");
	}
	public void printData(Integer a) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		new Test2().printData(34);

	}

}
