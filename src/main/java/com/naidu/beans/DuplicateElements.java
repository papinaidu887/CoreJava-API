package com.naidu.beans;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String str = "hello";

		String str1 = "java java hello hello spring spring rest jpa jpa";

		String[] array = str1.split(" ");
		
		Set<String> set1 = new HashSet<>();
		
		for(String s:array)
		{
			set1.add(s);
		}
		System.out.println(set1+"-------");

		LinkedHashSet<String> uniqueSet = convertArrayToSet(array);  

		System.out.println(uniqueSet);    

		DuplicateElements.uniqueCharacters(str);
		DuplicateElements.uniqueWords(str1);

	}

	private static <T> LinkedHashSet<T> convertArrayToSet(T array[]) {

		LinkedHashSet<T> set = new LinkedHashSet<>();

		for (T t : array) {
			set.add(t);
		}

		return set;
	}

	@SuppressWarnings("unused")
	private static void uniqueWords(String str1) {

		String[] words = str1.split(" ");

		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				int count = 0;
				for (int j = i + 1; i < word.length(); j++) {
					if (word.charAt(i) == word.charAt(j)) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.print(" " + word.charAt(i));
				}
			}
		}

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
			if (count == 0) {
				System.out.print(array[i]);
			}
		}

	}

}