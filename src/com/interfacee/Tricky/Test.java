package com.interfacee.Tricky;


interface A{
	public void getDetails();//
}
interface B{
	public abstract boolean isEven(int num);
}
class C implements A,B{

	@Override
	public void getDetails() {
		System.out.println("This is B child Class methods");
		
	}

	@Override
	public boolean isEven(int num) {
		
		return num%2==0;
	}
	

}
	

public class Test {

	public static void main(String[] args) {
		C c=new C();
		
		//Dynamic dispatch method->Method overriding
		
		A a=c;
		B b=c;
		
		a.getDetails();
		System.out.println(b.isEven(40));

	}

}
