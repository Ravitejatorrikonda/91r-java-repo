package com.abstraction;

abstract class Shape{
	public abstract void area();
}

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		
		this.radius = radius;
	}
	

	public void area() {
		System.out.println("Area of the circle : "+Math.PI * radius*radius);
	}
}


class Rectangle extends Shape{
	int length;
	int breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public void area() {
		System.out.println("Area of Rectangle : "+(length*breadth));
	}
}

public class Test2 {

	public static void main(String[] args) {
		Shape obj;
		
		obj=new Circle(30);
		obj.area();
		
		obj=new Rectangle(34, 40);
		obj.area();

	}

}
