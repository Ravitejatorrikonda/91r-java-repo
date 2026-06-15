package com.Exception.test;

class InvaliageException extends Exception{
	public InvaliageException(String message) {
		super(message);
		
	}
}
class St{
	public void checkAge(int age)throws InvaliageException {
		if(age < 16) {
			throw new InvaliageException("Invalid age...");
		}else {
			System.out.println("adult");
		}
	}
}

public class Example8 {

	public static void main(String[] args) {
         try {
        	 new St().checkAge(15);  
		} catch (Exception e) {
			e.printStackTrace();
		}  
         System.out.println("I am Exciuted..");
	}

}
