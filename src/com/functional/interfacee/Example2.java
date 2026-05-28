package com.functional.interfacee;

import java.util.function.Consumer;

class Employee{
	String empName;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	
	
}

public class Example2 {

	public static void main(String[] args) {
		Consumer<Employee> consumer=new Consumer<Employee>() {
			
			@Override
			public void accept(Employee emp) {
				System.out.println(emp.empName);
				
			}
		};
		consumer.accept(new Employee("Jagadeesh"));

	}

}
