package com.naidu.beans;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrence {

	public static void main(String[] args) {

		String str = "hello java hello spring springboot spring";

		String[] words = str.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			if (!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				int count = map.get(word);
				map.put(word, count + 1);
			}
		}
		System.out.println(map);
	}

}
