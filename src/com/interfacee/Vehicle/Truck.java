package com.interfacee.Vehicle;

public class Truck implements Vehicle{
	@Override
	public void accelarate() {
		System.out.println("Truck accelarating ");
		
	}

	@Override
	public void stop() {
		System.out.println("Truck stoping");
		
	}

	@Override
	public void start() {
		System.out.println("Truck started...");
		
	}

	@Override
	public void brake() {
		System.out.println("Truck applying  brakes....");
		
	}

	@Override
	public boolean pollutioncheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
