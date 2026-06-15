package com.Exception.test;

class Test {
	public void getData(int num) throws NullPointerException, ArithmeticException {
		if (num == 0) {
			throw new NullPointerException();
		} else if (num < 0) {
			throw new ArithmeticException();
		}else {
			System.out.println("Correct way to exicute");
		}
	}
}

public class Example7 {

	public static void main(String[] args) {
		try {
			new Test().getData(0);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("I amExicuted..");

	}

}
