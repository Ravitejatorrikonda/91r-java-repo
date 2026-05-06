package com.interfacee.Vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vh;
		vh=new Car();
		vh.accelarate();
		vh.start();
		vh.stop();
		vh.brake();
		System.out.println(vh.pollutioncheck());

	}

}
