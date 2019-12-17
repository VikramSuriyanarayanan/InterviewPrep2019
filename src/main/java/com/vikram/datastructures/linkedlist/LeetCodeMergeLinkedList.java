/**
 * 
 */
package com.vikram.datastructures.linkedlist;

/**
 * @author Remoz World
 *
 *Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
public class LeetCodeMergeLinkedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode output = new ListNode(0);
		ListNode dummy =  output;

		while(l1 != null && l2 !=null) {
                
			if (l2.val <= l1.val) {
				output.next = l2;
				l2 = l2.next;
			} else {
				output.next = l1;
				l1 = l1.next;
			}
			
			output = output.next;
		}
		
		if (l1 != null) 
			output.next = l1;
		
		if (l2 !=null)
			output.next = l2;

		return dummy.next;
	}
}

