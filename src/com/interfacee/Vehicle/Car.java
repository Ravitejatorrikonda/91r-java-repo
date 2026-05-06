package com.interfacee.Vehicle;

public class Car implements Vehicle{

	@Override
	public void accelarate() {
		System.out.println("car accelarating ");
		
	}

	@Override
	public void stop() {
		System.out.println("Car stoping");
		
	}

	@Override
	public void start() {
		System.out.println("car started...");
		
	}

	@Override
	public void brake() {
		System.out.println("car applying  brakes....");
		
	}

	@Override
	public boolean pollutioncheck() {
		return true;
		
	}
	

	

}
