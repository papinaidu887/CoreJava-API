package com.naidu.beans;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {

		String str = "Hello Naidu naidu ";
		String str1 = str.toLowerCase();

		String str2 = str1.replaceAll("\\s", "");

		char[] chars = str2.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, count + 1);
			}
		}
		System.out.println(" " +map);

	}

}
