package com.naidu.beans;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int armstrongNumber = 153; // 1+125+27

		int armstrongNumbers = 1000;
		
		System.out.println("to check ArmstrongNumber or Not::...");
		System.out.println("=======================================");

		ArmstrongNumber.toCheckArmstrongOrNot(armstrongNumber);
		
		System.out.println();
		System.out.println("Armstrong numbers from 1 to 1000::...");
		System.out.println("=======================================");

		ArmstrongNumber.toPrintArmStrongNumbers(armstrongNumbers);  // o/p: 1, 153, 370, 371, 407

	}

	private static void toPrintArmStrongNumbers(int armstrongNumbers) {

		int end = armstrongNumbers;

		int n, rem, sum = 0;

		for (int i = 1; i <= end; i++) {

			n = i;

			while (n > 0) {
				rem = n % 10;
				sum = sum + (rem * rem * rem);
				n = n / 10;
			}
			if (sum == i) {
				System.out.print(" " + i);
			}
			sum = 0;

		}

	}

	private static void toCheckArmstrongOrNot(int armstrongNumber) {
		int sum = 0, rem;
		int temp = armstrongNumber;

		while (armstrongNumber > 0) { // 153 15 1
			rem = armstrongNumber % 10; // 3 5 1
			sum = sum + (rem * rem * rem); // 27 152
			armstrongNumber = armstrongNumber / 10; // 15 1

		}
		if (temp == sum) {
			System.out.println("Its ArmStrong");    
		} else {
			System.out.println("Its not ArmStrong");
		}
	}

}
