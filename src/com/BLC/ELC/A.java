package com.BLC.ELC;

public class A {

	private String stName;
	private String stCity;
	private int stId;
	private int stMarks;
	
	
	public String getStName() {
		return stName;
	}
	public String getStCity() {
		return stCity;
	}
	public int getStId() {
		return stId;
	}
	public int getStMarks() {
		return stMarks;
	}
	
	//setters
	   public void setStName(String name) {
		   stName=name;
	   }
	   public void setStCity(String city) {
		   stCity=city;
	   }
	   public void setStId(int Id) {
		   stId=Id;
	   }
	   public void setStMarks(int marks) {
		   stMarks=marks;
	   }
	
	public void getData() {
		System.out.println("Student Name : "+stName);
		System.out.println("Student City : "+stCity);
		System.out.println("Student ID : "+stId);
		System.out.println("Student Marks : "+stMarks);
	}

	
	
}
