package com.interfacee.Telivision;

public class Led implements Telivision{
	@Override
	public void chnagingchannels(int num) {
		System.out.println(" LED Present channel Number : "+ num);
		
	}

	@Override
	public void volumeIncreasing(int val) {
		System.out.println("LED Volume Increasing : "+(Telivision.volume+val));
		
	}

	@Override
	public void volumedecrease(int val) {
		System.out.println("LED Volume Decreasing : "+(Telivision.volume-val));
		
	}
}
