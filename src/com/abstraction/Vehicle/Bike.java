package com.abstraction.Vehicle;

public class Bike extends Vehicle {
	boolean hasSidecar;

	public Bike(String modelName, int vehicleNumber, String company, boolean hasSidecar) {
		super(modelName, vehicleNumber, company);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting engine with kick-start.");
		
	}
	
	

}
