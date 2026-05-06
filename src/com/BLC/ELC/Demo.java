package com.BLC.ELC;

public class Demo {
	String name,city,state;
	
	public String getData() {
		return name;
	}

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.name="Sai";
		obj.city="HYD";
		obj.state="TS";
		System.out.println(obj.getData());

	}

}
