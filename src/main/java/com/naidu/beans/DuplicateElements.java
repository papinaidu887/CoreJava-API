package com.naidu.beans;

public class DuplicateElements {

	public static void main(String[] args) {

		String str = "hello";

		DuplicateElements.uniqueCharacters(str);

	}

	private static void uniqueCharacters(String str) {

		char[] array = str.toCharArray();

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(array[i]);
			}
		}

	}
}