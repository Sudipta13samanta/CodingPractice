package com.sudipta.practics.algo;

import java.util.List;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));

	}

	private static boolean isPalindrome(int x) {
		String st = Integer.toString(x);
		int str = 0;
		int end = st.length()-1;
		char ch[] = st.toCharArray();
		while(str < end) {
			if(ch[str] != ch[end]) {
				return false;
			}
			
			str++;
			end--;
		}
		
		return true;
	}
	
}
