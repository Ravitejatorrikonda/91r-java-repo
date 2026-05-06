package com.BLC.ELC;

import java.util.jar.Attributes.Name;

public class X {
	private String name;
	private int Id;

	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	// setters

	public void setName(String Name) {
		name = Name;
	}

	public void setId(int id) {
		Id = id;
	}

	public void getData() {
		System.out.println("St Name : "+name);
		System.out.println("St Id : "+Id);
		
           
	}

}
