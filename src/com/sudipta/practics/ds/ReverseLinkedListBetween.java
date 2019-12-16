package com.sudipta.practics.ds;

public class ReverseLinkedListBetween {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		
		
		ListNode rst =  reverseBetween(node, 2, 4);
		while(rst != null) {
			System.out.print(rst.val+"->");
			rst = rst.next;
		}

	}

	private static ListNode reverseBetween(ListNode node, int m, int n) {
		ListNode prev = null, next = null, curr = node;
		int count = 0;
		while(curr != null) {
			count ++;
			prev = curr;
			if(count >= m && count > n) {
				next = curr.next;
				curr.next = prev;
				curr = next;
			}else {
				curr = curr.next;
			}
			
		}
		return null;
	}

}
