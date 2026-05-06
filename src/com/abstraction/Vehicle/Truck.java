package com.abstraction.Vehicle;

public class Truck extends Vehicle{
	int cargoCapacity;

	public Truck(String modelName, int vehicleNumber, String company, int cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
		
	}
	
	@Override
	public void fuelType() {
		System.out.println("Diesel");
	}

}
