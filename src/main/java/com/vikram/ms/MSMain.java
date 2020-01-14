package com.vikram.ms;

import com.vikram.datastructures.linkedlist.LeetCodeReverseLinkedList;
import com.vikram.datastructures.linkedlist.ListNode;

public class MSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		
		head.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		//System.out.println(llcr.detectCycle(head).val);
		
		ReverseLinkedList revLL = new ReverseLinkedList();
		System.out.println(revLL.reverseLinkedList(head).val);
		
		LuckyNumbers lucky = new LuckyNumbers();
		System.out.println("IS LUCKY?"+ lucky.isLuckyNumber(20));
		System.out.println("Get LuckyNumbers: "+ lucky.getLuckyNumberList().toString());
	}

}
