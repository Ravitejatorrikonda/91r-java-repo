package com.abstraction;

abstract class Animal{
	public abstract void makingSound();
}
class Dog extends Animal{
	
	public void makingSound() {
		System.out.println("Bow  Bow");
	}
}

class Cat extends Animal{
	public void makingSound() {
		System.out.println("meow meow...");
	}
}



public class Test1 {

	public static void main(String[] args) {
	     Animal ani=new Cat();
	     ani.makingSound();

	}

}
