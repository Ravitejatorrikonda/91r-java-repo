package com.thiskeyword;

public class Example2 {
	public int x=10;
	//                       20
	public void printData(int x) {
		System.out.println(x);//20
		System.out.println(this.x);//10
		this.x=40;
		
	}
	

	public static void main(String[] args) {
		Example2 obj=new Example2();
		
		System.out.println(obj.x);//10
		
		obj.printData(20);
		System.out.println(obj.x);//10
		

	}

}
