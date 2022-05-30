package com.naidu.beans;

public class PalindromeNumber {

	public static void main(String[] args) {

		int palindromeNumber = 121;

		int palindromeNumbers = 250;
		System.out.println("to check palindromeNumber or Not::....");
		System.out.println("========================================");
		PalindromeNumber.toCheckPalindromeOrNot(palindromeNumber);
		System.out.println();
		System.out.println("palindromeNumbers from 1 to 250 ");
		System.out.println("==================================");
		PalindromeNumber.toPrintPalindromeNumbers(palindromeNumbers);

	}

	private static void toPrintPalindromeNumbers(int palindromeNumbers) {

		int n, sum = 0, rem;
		int end = palindromeNumbers;

		for (int i = 1; i < end; i++) {
			n = i;
			while (n > 0) { // 121 12 1 F
				rem = n % 10; // 1 2 1
				sum = (sum * 10) + rem; // 1 12 121
				n = n / 10; // 12 1

			}
			if (sum == i) {
				System.out.print(" " + i);
			}
			sum = 0;
		}

	}

	private static void toCheckPalindromeOrNot(int palindromeNumber) {
		int sum = 0, rem;
		int n = palindromeNumber;

		while (n > 0) { // 121 12 1 F
			rem = n % 10; // 1 2 1
			sum = (sum * 10) + rem; // 1 12 121
			n = n / 10; // 12 1

		}
		if (palindromeNumber == sum) {
			System.out.println("its palindrome");
		} else {
			System.out.println("its not palindrome");
		}

	}

}
