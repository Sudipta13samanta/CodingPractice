package com.sudipta.practics.algo;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "bababbdbababad";
		int str = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCerner(s,i,i);
			int len2 = expandAroundCerner(s,i,i+1);
			int maxLen = Math.max(len1, len2);
			
			if (maxLen > end - str) {
				str = i - (maxLen - 1) / 2;
	            end = i + maxLen / 2;
	        }
		}
		
		System.out.print(s.substring(str, end+1));

	}

	private static int expandAroundCerner(String s, int l, int r) {
		
		while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}

		return r - l -1;
	}

}
