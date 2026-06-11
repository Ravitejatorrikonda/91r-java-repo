package com.Exception.test;

public class Examle3 {

	public static void main(String[] args) {
               try {
            	   int [] arr= {1,2,3,4};
                   System.out.println(arr[4]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
               System.out.println("i am Excicuted ..");
               
               try {
            	   String str=null;
                   System.out.println(str.toUpperCase());
                   
				
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
               System.out.println("null pointer exception cleared ");
               
               
	}

}
