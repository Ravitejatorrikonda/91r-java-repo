package com.interfacee.Tricky;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started");
		
	}

	@Override
	public void stop() {
		System.out.println("Car stoped..");
		
	}

	@Override
	public void pollutionCheck() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void digitalmeter() {
		System.out.println("Installed");
	}

}
