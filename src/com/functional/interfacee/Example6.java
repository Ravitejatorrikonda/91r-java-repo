package com.functional.interfacee;

import java.util.function.Consumer;


public class Example6 {

	public static void main(String[] args) {
	
		Consumer<String> c=new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
			
		};
		
		c.accept("Java is Awesome..");
		
               
	}

}
