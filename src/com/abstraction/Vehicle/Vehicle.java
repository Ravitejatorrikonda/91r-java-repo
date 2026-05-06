package com.abstraction.Vehicle;

public abstract class Vehicle {
	String modelName;
    int vehicleNumber;
    String company;
    
	public Vehicle(String modelName, int vehicleNumber, String company) {
		
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}

	public abstract void startEngine();

	public void fuelType() {
                System.out.println("Petrol");
	}

}
