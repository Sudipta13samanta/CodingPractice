package com.sudipta.practics.algo;
/**
 * Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
 * @author user
 *
 */
public class AllUniqueCharInString {

	public static void main(String[] args) {
		System.out.println(isAllUniqueChar("abcd"));
	}
	
	private static boolean isAllUniqueChar(String s) {
		int ch[] = new int[256];
		
		for(int i=0; i<s.length(); i++) {
			int val = s.charAt(i)-'a';
			ch[val] = ch[val]+1;
			if(ch[val]>1) return false;
		}
		
		return true;
	}
}
