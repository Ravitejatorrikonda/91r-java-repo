package com.constructor.chainging;

class A{
	public A(int a) {
		System.out.println(a+20);
		System.out.println("this is parent class constructor....");
	}
	public A() {
		this(10);
		System.out.println("this is no paramaeterised constructor");
	}
}
class B extends A{
	public B() {
		this(20);
		System.out.println("this is child class constructor.....");
	}
	public B(int c) {
		
		System.out.println(c);
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		new B();

	}

}
