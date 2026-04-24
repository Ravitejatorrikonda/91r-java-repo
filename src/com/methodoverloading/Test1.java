package com.methodoverloading;




public class Test1 {
	/**
	 * 
	 * 
	 * byte 
	 * 
	 * short
	 * int
	 * long
	 * float
	 * double
	 * 
	 * 
	 * 
	 * @param a
	 * @param b
	 */
	
	public void print(int a, int b) {
		System.out.println("int "+ (a+b));
	}
	public void print(short a, short b) {
		System.out.println("short : "+(a+b));
	}
	public void print(double a, double b) {
		System.out.println("Double : "+ (a+b));
	}

	public static void main(String[] args) {
		      short s1=34;
		      short s2=43;
	           new Test1().print(s1, 43);
                
	}

}
