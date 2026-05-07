package com.interfacee.Tricky;

//class X1{
//	public static void print() {
//		System.out.println("X1 parent class");
//	}
//	
//}
//class Y1 extends X1{
//	
//}

interface F1{
	public static void printer() {
		System.out.println("This is static method in interface");
		
	}
}
class G1 implements F1{
       
	public static void printer() {
		
		System.out.println("This is static method in interface");
		
	}
}

public class Test2 {

	public static void main(String[] args) {
	       F1.printer();
//	       G1.printer();

	}

}
