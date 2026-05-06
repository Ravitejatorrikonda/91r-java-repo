package com.constructor.chainging;



class C{
	
	public void getData() {
		System.out.println("Parent");
	}
	
	
}

class D extends C{
	public void getData() {
//		C c=new C();
//		c.getData();
		super.getData();
		System.out.println("Child");
	}
}

public class Example4 {

	public static void main(String[] args) {
	           C d=new D();
	           d.getData();

	}

}
