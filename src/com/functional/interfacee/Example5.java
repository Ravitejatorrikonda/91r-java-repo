package com.functional.interfacee;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example5 {

	public static void main(String[] args) {
		Function<String, String> f=new Function<String, String>() {

			@Override
			public String apply(String i) {
				
				return i.toUpperCase();
			}
			
		};
		System.out.println(f.apply("java is awesome"));

	}

}
