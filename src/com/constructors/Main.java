package com.constructors;

public class Main {

	public static void main(String[] args) {
		Example2 obj=new Example2("Bharath", "SD", 100, 100000);

		
		obj.getDetails();
		
		obj.UpdatedSalary(20000);
		System.out.println("Updated Salary : "+obj.getEmpSalary());
		
	}
	
	

}
