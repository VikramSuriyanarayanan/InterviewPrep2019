/**
 * 
 */
package com.vikram.ms;

import com.vikram.datastructures.linkedlist.ListNode;

/**
 * @author Remoz World
 *
 */
public class ReverseLinkedList {
	public ListNode reverseLinkedList(ListNode node) {
		if (node == null)
			return node;
		
		ListNode currentNode = node;
		while(node.next!=null) {
			ListNode temp = node.next;
			node.next = temp.next;
			temp.next = node;
			currentNode = temp;
		}
		return currentNode;
	}
}
