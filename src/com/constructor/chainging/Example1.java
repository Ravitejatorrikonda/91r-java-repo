package com.constructor.chainging;




class X{
	public X() {
		
		System.out.println("java is awesome");
	}
	public X(int a) {
//		this();
		System.out.println(a+10);
		System.out.println("91r java batch is awesome");
	}
}

public class Example1 {
	public static void main(String[] args) {
		   new X(10);
	

	}

}
