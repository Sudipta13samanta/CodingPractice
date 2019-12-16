package com.sudipta.practics.ds;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		
		ListNode rst =  reverseList(node);
		while(rst != null) {
			System.out.print(rst.val+"->");
			rst = rst.next;
		}
		
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null, next = null, curr = head;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
		return head;
    }

}