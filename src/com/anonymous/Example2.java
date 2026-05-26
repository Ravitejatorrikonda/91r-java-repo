package com.anonymous;
class Student{
	String stName;

	public Student(String stName) {
		super();
		this.stName = stName;
	}
	
}

@FunctionalInterface
interface St{
	abstract String getName();
	default void Getdata1() {
		
	}
	
	
}


public class Example2 {

	public static void main(String[] args) {
		
		Student s=new Student("Murali");
		System.out.println(s.stName);
		
		St s1=new St() {
			@Override
			public String getName() {
				return "Karthik";
			}
		};
		System.out.println(s1.getName());
		

	}

}
