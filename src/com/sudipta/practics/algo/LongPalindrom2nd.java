package com.sudipta.practics.algo;

public class LongPalindrom2nd {

	public static void main(String[] args) {
		String str = "babad";
		System.out.println(find(str));
	}
	
	private static String find(String s) {
		char ch[] = s.toCharArray();
		int max  = 0;
		int strin = 0;
		int endin = 0;
		
		for(int i=0; i<ch.length; i++) {
			int str = i;
			int end = i+1;
			while(str >= 0 && end < ch.length  && ch[str] == ch[end]) {
				if(max< end-str+1) {
					max = end-str+1;
					strin = str;
					endin = end;
				}
				
				str--;
				end++;
			}
		}
		
		return s.substring(strin, endin+1);
	}

}
