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
			ListNode nextNode = head.next;
			head.next = nextNode.next;
			nextNode.next = currentHead;
			currentHead = nextNode;
		}
		return currentHead;
	}
}
