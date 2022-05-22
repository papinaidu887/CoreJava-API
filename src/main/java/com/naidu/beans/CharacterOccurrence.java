package com.naidu.beans;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {

		String str = "hello";

		char[] chars = str.toCharArray();

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
