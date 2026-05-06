package com.constructors;

public class Example1 {
	
	String name;
	int id;
	
	public Example1(String name,int id){
	this.name=name;
	this.id=id;
	}
	
	
	
	

	public static void main(String[] args) {
		    Example1 obj=new Example1("Deva",100); 
		    
		    System.out.println(obj.name);
		    System.out.println(obj.id);

	}

}
