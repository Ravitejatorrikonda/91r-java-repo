package com.methodoverriding;


class Parent{
	public void eating(String str) {
		System.out.println("parent eating idly");
	}
	public void sleep(String str) {
		System.out.println("parent sleep at 10pm ");
	}
	
}
class Child extends Parent{
	public void eating(String str) {
		System.out.println("Chuld eating fast foods...........");
	}
	public void sleep(String str) {
		System.out.println("Child sleep at 1 am.... ");
	}
}
public class Test1 {

	public static void main(String[] args) {
//		Child parent=(Child)new Parent();
//		
//		parent.sleep("hello");
//		parent.eating("there");
		
		
		/**
		 * at the time of compilation
		 * compiler will check the if the method is present in parent class or not
		 * 
		 * ->if method is not presenting in parent class, it will throw a CR
		 * 
		 * ->if method is present in parent class , now the responsibulity 
		 * will take by the interpreter
		 * interpreter will check the which object you are going to created
		 * that object class will be invoked
		 * 
		 */
		
		
		
		
//		Parent parent=new Parent();
//		parent.sleep("hello");
//		parent.eating("there");

	}

}
