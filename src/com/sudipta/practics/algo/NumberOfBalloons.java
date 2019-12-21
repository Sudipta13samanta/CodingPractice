package com.sudipta.practics.algo;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBalloons {

	public static void main(String[] args) {
		String str = "nlaebolko";
		System.out.println(maxNumberOfBalloons(str));
        
        
	}

	private static int maxNumberOfBalloons(String text) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c:text.toCharArray()){
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int max = map.getOrDefault('l', 0)/2;
		max = Math.min(max, map.getOrDefault('0', 0)/2);
		max = Math.min(max, map.getOrDefault('b', 0));
		max = Math.min(max, map.getOrDefault('a', 0));
		max = Math.min(max, map.getOrDefault('n', 0));
				
		return max;
	}
	
}
