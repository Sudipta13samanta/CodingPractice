package com.sudipta.practics.ds;

import java.util.Stack;

public class LinkListPalindrome {

	
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		System.out.println(isPalindrome(node));

	}
	
	public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        
        while(temp != null){
            if(temp.val == stack.pop()){
                temp = temp.next;
            }else{
                return false;
            }
        }
        
        return true;
    }

}

/*
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
*/