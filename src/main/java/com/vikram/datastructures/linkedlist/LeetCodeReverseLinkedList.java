/**
 * 
 */
package com.vikram.datastructures.linkedlist;

/**
 * @author Remoz World
 *
 */
public class LeetCodeReverseLinkedList {
	public ListNode reverseList(ListNode head) {

		if (head == null) {
			return head;
		}
		ListNode currentHead = head;
		while (head.next != null) {
			ListNode p = head.next;
			head.next = p.next;
			p.next = currentHead;
			currentHead = p;
		}
		return currentHead;
	}
}
