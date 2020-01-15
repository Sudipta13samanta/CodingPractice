package com.sudipta.practics.algo;
/**
 * Write code to reverse a C-Style String. (C-String means that “abcd” 
 * is represented as five characters, including the null character.)
 * @author user
 *
 */
public class StringRev {

	public static void main(String[] args) {
		System.out.println(revers("abcd"));

	}

	private static String revers(String s) {
		char ch[] = s.toCharArray();
		String rslt = "";
		for(int i=ch.length-1; i>=0; i--) {
			rslt = rslt + ch[i];
		}
		
		return rslt;
	}

}
