package com.functional.interfacee;

import java.util.function.Predicate;

class St implements Predicate<Integer>{
	public boolean test(Integer i) {
		return i%2==0;
	}
}

public class Example3 {

	public static void main(String[] args) {
		Predicate<Integer> p=new St();
		System.out.println(p.test(34));
		
		Predicate<Integer> p1=new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i%2==0;
			}
			
		};
		System.out.println(p1.test(2));
		
		
		

	}

}
