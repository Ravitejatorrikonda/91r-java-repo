package com.interfacee.Vehicle;

public class Bike implements Vehicle {
	@Override
	public void accelarate() {
		System.out.println("Bike accelarating ");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike stoping");
		
	}

	@Override
	public void start() {
		System.out.println("Bike started...");
		
	}

	@Override
	public void brake() {
		System.out.println("Bike applying  brakes....");
		
	}

	@Override
	public boolean pollutioncheck() {
		
		return false;
	}

}
