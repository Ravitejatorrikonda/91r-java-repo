package com.abstraction.Vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vh;
		vh=new Car("Toyota Camry", 123, "toyota", 4, true);
		vh.startEngine();
		vh.fuelType();
		System.out.println("-----------------");
		
		vh=new Bike("Yamaha R1", 789, "Yamaha", false);
		vh.startEngine();
		vh.fuelType();
		System.out.println("===================");
		
		vh=new Truck("Volvo FH", 2, "volvo", 10000);
		vh.startEngine();
		vh.fuelType();

	}

}
