package com.methodoverriding;

class Xparent{
	public Object getnumber() {
		return 100;
	}
	
}
class Ychild extends Xparent{
	@Override
	public Number getnumber() {
		return 200;
	}
}
class Zchild extends Ychild{
//	public Integer getnumber() {
//		return 300;
//	}
}

public class Test4 {

	public static void main(String[] args) {
		 Xparent x=new Zchild();
		      Integer i=(Integer)x.getnumber();//number
		      System.out.println(i);

	}

}
