package com.sudipta.practics.ds;

public class DeleteNode {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(3);
		
		ListNode reslt = deleteNode(node, 3);

	}

	private static ListNode deleteNode(ListNode node, int i) {
		ListNode curr = node;
		ListNode pre = null;
		while(curr != null && curr.val != i) {
			pre = curr;
			curr = curr.next;
		}
		
		pre.next = curr.next;
		
		return null;
	}
}
