package com.Exception.test;



class Parent{
	public void isEven(int num)throws RuntimeException{
		if(num<=0) {
			throw new RuntimeException("Zero not allowing......");
		}else {
			System.out.println(num%2==0?"Even":"Odd");
		}
	}
}

public class Example6 {

	public static void main(String[] args){
		try {
			new Parent().isEven(0);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("I am exicuted...");

	}

}
