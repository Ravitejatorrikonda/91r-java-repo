package com.Exception.test;

class InvalidAgeOfVehicleException extends Exception {
	public InvalidAgeOfVehicleException(String message) {
		super(message);

	}

}

class InvalidAgeOfTireException extends Exception {
	public InvalidAgeOfTireException(String message) {
		super(message);
	}
}

class InvalidAgeOfEngineException extends Exception {
	public InvalidAgeOfEngineException(String message) {
		super(message);
	}

}

class Vehicle {
	public void checkAge(int ageOfVehicle, int ageOfEngine, int ageOfTire)
			throws InvalidAgeOfVehicleException, InvalidAgeOfEngineException, InvalidAgeOfTireException {
		if (ageOfVehicle > 10) {
			throw new InvalidAgeOfVehicleException("invalid age...");
		} else if (ageOfEngine > 15) {
			throw new InvalidAgeOfEngineException("invalid engine...");
		} else if (ageOfTire > 2) {
			throw new InvalidAgeOfTireException("invalid tire condition");
		} else {
			System.out.println("valid condition......");
		}
	}
}

public class Example9 {

	public static void main(String[] args) {
		try {
			new Vehicle().checkAge(15, 1, 1);
		} catch (InvalidAgeOfEngineException | InvalidAgeOfVehicleException | InvalidAgeOfTireException e) {
			e.printStackTrace();
		}
		System.out.println("Remaing code exicuted...");
	}

}
