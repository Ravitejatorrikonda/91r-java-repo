package com.lambda.expressions;

interface NumberCheck {
	public abstract boolean checkNum(int num);
}

interface CharCheck {
	public abstract void characterCheck(char ch);
}

public class Example2 {
	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i * i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		NumberCheck check = num -> isPrime(num);
		System.out.println(check.checkNum(3) ? "Prime" : "! Prime");

		CharCheck ch1 = ch -> System.out.println(isPrime(ch) ? "Prime" : "! Prime");
		ch1.characterCheck('A');

	}

}
