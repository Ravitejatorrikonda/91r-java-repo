package com.interfacee.Telivision;

public class DishTv implements Telivision {

	@Override
	public void chnagingchannels(int num) {
		System.out.println("Present channel Number : "+ num);
		
	}

	@Override
	public void volumeIncreasing(int val) {
		System.out.println("Volume Increasing : "+(Telivision.volume+val));
		
	}

	@Override
	public void volumedecrease(int val) {
		System.out.println("Volume Decreasing : "+(Telivision.volume-val));
		
	}
	

}
