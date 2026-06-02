package com.lambda.expressions;

@FunctionalInterface
interface Animal {
	abstract void makingSound(int cost1, int cost2);
}

//class Dog implements Animal {
//	public void makingSound(int cost) {
//		System.out.println("BOW BOW 1....." + cost);
//
//	}
//}

public class Example1 {

	public static void main(String[] args) {
		// lambda Expressions
		Animal ani= (int a, int b)->{
			System.out.println(a+b);
		};
		
		ani.makingSound(34,43);
		
		
		
		
		
//		Animal ani = new Dog();
//		ani.makingSound(30000);
//
//		Animal ani2 = new Animal() {
//
//			@Override
//			public void makingSound(int cost) {
//				System.out.println("BOW BOW 2...." + cost);
//
//			}
//		};
//
//		ani2.makingSound(40000);


	}

}
