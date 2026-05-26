package com.anonymous;


class Parent{
	public void getJob() {
		System.out.println("job");
	}
}

//class Child extends Parent{
//	public void getJob() {
//		System.out.println("Sf Job");
//	}
//}


public class Main {

	public static void main(String[] args) {
		
		//anonymousclass extends Parent
	//Parent p=new Anomous();
		Parent p=new Parent() {
			@Override
			public void getJob() {
				System.out.println("Sf job");
			}
		};
		
		p.getJob();
		

	}

}
