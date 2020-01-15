package com.sudipta.practics.algo.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 * Input: String="araaci", K=2
 * Output: 4
 * Explanation: The longest substring with no more than '2' distinct characters is "araa".
 * @author Sudipta
 *
 */
public class LongestSubstringOfKChar {

	public static void main(String[] args) {
		String input = "araaci";
		int k=3;
		System.out.println(longest_substring_with_k_distinct(input, k));
	}

	private static int longest_substring_with_k_distinct(String input, int k) {
		int max = 0;
		char ch[]= input.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for(int j=i;j<ch.length; j++) {
				map.put(ch[j], map.getOrDefault(ch[j], 0)+1);
				if(map.size()<=k && j-i > max) {
					max = j-i;
				}
			}
		}
		
		return max+1;
	}

}
