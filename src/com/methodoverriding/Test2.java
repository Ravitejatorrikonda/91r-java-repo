package com.methodoverriding;

class X{
	
	  public String getdata(String str) {
		return str.toLowerCase();
	}
	
}
class Y extends X{
 @Override
	public String getdata(String str) {
		return str;
	}
}

public class Test2 {

	public static void main(String[] args) {
		X x=new Y();
		String result=x.getdata("hellothere");
		System.out.println(result);

	}

}
