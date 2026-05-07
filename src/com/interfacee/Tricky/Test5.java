package com.interfacee.Tricky;

interface C1{
	public static void printer() {
		System.out.println("this is C1 class");
	}
	
}
interface D1{
	
	public static void printer() {
		System.out.println("this is D1 class");
	}
}
class E1 implements C1,D1{
	public void getData() {
		D1.printer();
		C1.printer();
		System.out.println("this is E1 class");
	}
}

public class Test5 {

	public static void main(String[] args) {
     E1 e=new E1();
        e.getData();

	}

}
