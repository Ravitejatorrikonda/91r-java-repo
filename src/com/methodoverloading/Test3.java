package com.methodoverloading;

class A{
	public void getData(byte a) {
		System.out.println("Byte");
	}
//	public void getData(short a) {
//		System.out.println("short");
//	}
}
class B extends A{
	public void getData(long a) {
		System.out.println("long");
	}
}

public class Test3 {

	public static void main(String[] args) {
		B obj1=new B();
		short s1=34;
		obj1.getData(s1);

	}

}
