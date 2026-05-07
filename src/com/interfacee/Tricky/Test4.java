package com.interfacee.Tricky;

interface M{
	default void getData() {
		System.out.println("This is M class default  method");
	}
}
interface N{
	default void getData() {
		System.out.println("this is N class default Method");
	}
}

class O implements M,N{

	@Override
	public void getData() {
		
		M.super.getData();//clasName.super.meth()   //    classname.method();
		N.super.getData();
		System.out.println("child class");
		
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		O o=new O();
		
		M m=o;
		N n=o;
        
		m.getData();
		
	}

}
