package com.naidu.beans;

public class PrimeNumbers {

	public static void main(String[] args) {

		// to check prime number or not
		int n = 50;
		PrimeNumbers.toCheckPrimeNumberOrNot(n);
		PrimeNumbers.toPrintAllPrimeNumbers(n);

	}

	private static void toPrintAllPrimeNumbers(int n) {
		int start;
		int end = n;
		System.out.println("--------------------------------------------------");
		System.out.println("to print prime numbers are between 1 to " + n);
		for (start = 2; start < end; start++) {
			int count = 0;
			for (int i = 2; i < start; i++) {
				if (start % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(" " + start);
			}
		}

	}

	private static void toCheckPrimeNumberOrNot(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("its prime number");
		} else {
			System.out.println("its not prime number");
		}

	}

}
