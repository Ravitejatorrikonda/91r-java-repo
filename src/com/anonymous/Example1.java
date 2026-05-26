package com.anonymous;

abstract class Employee{
	abstract String empName();
}

abstract class Vehicle{
	abstract void honk();
}



public class Example1 {

	public static void main(String[] args) {
		
		Employee emp=new Employee() {
			
			@Override
			String empName() {
				// TODO Auto-generated method stub
				return "Saiteja";
			}
		};
	System.out.println(	emp.empName());
		
		
		
		
		
		//v extends Vehicle
		// verhicle v=new Anonymous()
		Vehicle v=new Vehicle() {
			
			@Override
			public void honk() {
				System.out.println("honking.....");
				
			}
		};
		v.honk();

	}

}
