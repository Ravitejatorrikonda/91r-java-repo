package com.Vehicles;

class Vehicle{
	public String make;
	public String model;
	public String year;
	
	
	public Vehicle(String make, String model, String year) {
//		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	
	public void dispplayInfo() {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}
	
	
}


class Car extends Vehicle{
	public String numberOfDoors;

	public Car(String make, String model, String year, String numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	
	public void displayCarInfo() {
		super.dispplayInfo();
		System.out.println("number Of Doors : "+ numberOfDoors);
		
	}
	
	
}


class Truck extends Vehicle{
	public int cargoCapacity;

	public Truck(String make, String model, String year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	
	
	public void displayTruckInfo() {
		super.dispplayInfo();
		System.out.println("Cargo Capacity : "+cargoCapacity);
	}
	
}


public class Example1 {

	public static void main(String[] args) {
		
//		Vehicle car = new Car("Toyota", "Corolla", "2022", "4");
//		
////		car.dispplayInfo();
//		((Car)car).displayCarInfo();
		
		
		Vehicle truck=new Truck("Ford", "F123", "2000", 1000);
		
		((Truck)truck).displayTruckInfo();
	
	}

}
