package com.sudipta.practics.algo;

import java.util.HashMap;
import java.util.Map;

public class NoSequenceOfRepetation {

	public static void main(String[] args) {
		String str = "11100102001100";
		char ch[] = str.toCharArray();
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length() - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				count++;
				if (count == 1) {
					int value = map.getOrDefault(ch[i], 0);
					value++;
					map.put(ch[i], value);

				}
			} else {
				count = 0;
			}
		}

		for (char c : map.keySet()) {
			System.out.println(c + " - " + map.get(c) + "times");
		}

	}

}
