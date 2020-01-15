package com.sudipta.practics.algo;

import java.util.Stack;

public class Calculator {

	public static void main(String[] args) {
		String str = " 3+5 / 2 ".trim();
		calculate(str);

	}

	private static int calculate(String str) {
		Stack<Integer> stack = new Stack<>();
		int num = 0;
		char prech = '+';
		str = str + "+";// for calculate last char
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				continue;
			}else if(Character.isDigit(ch)) {
				num = num*10+ Character.getNumericValue(ch); // for input '42*34'
			}else {
				if(prech == '+') {
					stack.push(num);
				}else if(prech == '-') {
					stack.push(-num);
				}else if(prech == '*') {
					stack.push(stack.pop()*num);
				}else if(prech == '/') {
					stack.push(stack.pop()/num);
				}
				prech = ch;
				num=0;
			}
			
		}
		
		int result = 0;
		while(!stack.isEmpty()) {
			result = result + stack.pop();
		}
		
		return result;
	}

}
