package com.constructor.chainging;


class Bicycle{
	String handile;
	String  tyre;
	String chain;
	public Bicycle(String handile, String tyre,String chain) {
		this.handile=handile;
		this.tyre=tyre;
		this.chain=chain;
		System.out.println("Bicycle Object created.....");
		
	}
	
	public void applyBreaks() {
		System.out.println("bicycyle stoped.........");
	}
	
}
//class car extends Bike{
//	
//}

class Bike extends Bicycle{
	String engine;
	
	String fuel;
	String light;
	
	public Bike(String handile, String tyre, String chain, String engine, String fuel, String light) {
		super(handile,tyre,chain);
		this.engine=engine;
		this.fuel=fuel;
		this.light=light;
		System.out.println("bike Object created");
	}
//	public void applyBreaks() {
//		System.out.println("bike stoped.........");
//	}
}

public class Example3 {

	public static void main(String[] args) {
		Bike obj=new Bike("hero", "mrf", "cyclechain", "350cc", "petrol", "LED");

		obj.applyBreaks();
	}

}
