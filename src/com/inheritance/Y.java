package com.inheritance;

public class Y extends X {
    public String name2="Bharath";
    public void meth2() {
    	System.out.println("This is Child class");
    }
	
	
	public static void main(String[] args) {
//	   Y y=(Y)new X();
		
		X x=new Y();
		Y y=(Y)new X();
	   
	   
	   System.out.println(y.name1);
	   y.meth1();
	}

}
