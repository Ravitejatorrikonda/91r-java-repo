package com.interfacee.Telivision;

public class TvMain {

	public static void main(String[] args) {
		Telivision t;
		t=new DishTv();
		t.chnagingchannels(20);
		t.volumeIncreasing(50);
		t.volumedecrease(0);
		System.out.println("-------------");
		t=new Led();
		t.chnagingchannels(34);
		t.volumeIncreasing(0);
		t.volumedecrease(20);

	}

}
