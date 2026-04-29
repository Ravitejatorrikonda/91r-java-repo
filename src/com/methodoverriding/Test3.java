package com.methodoverriding;


class A{
	public void method() {
		System.out.println("A class method....");
	}
}
class B extends A{
	public void method() {
		System.out.println("B class Method......");
	}

	
}



class Afactory{
	public A getObjectmethod() {
		return new A();
	}
}
class Bfactory extends Afactory{
	@Override
	public B getObjectmethod() {
		return new B();
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Afactory a=new Bfactory();
		
//		    B obj=(B)a.getObjectmethod();//new B()
//		    obj.method();
//		
		
		
//		Bfactory b=new Bfactory();
//		 B obj =b.getObjectmethod();//
//		 obj.method();
//		
		
		
		
//          Afactory a=new Afactory();
//             A obj =a.getObjectmethod();
//             obj.method();

	}

}
