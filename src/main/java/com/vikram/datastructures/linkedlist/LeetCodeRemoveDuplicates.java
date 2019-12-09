/**
 * 
 */
package com.vikram.datastructures.linkedlist;

/**
 * @author Remoz World
 Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */
public class LeetCodeRemoveDuplicates {
	 public ListNode removeElements(ListNode head, int val) {
	        
	        if (head == null)
	            return null;
	        
	        while (head != null && head.val == val) 
	        	head = head.next;

	  
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        
	        while(dummy.next != null) {
	            if(dummy.next.val == val) {
	                dummy.next = dummy.next.next;
	            } else {
	                dummy = dummy.next;
	            }
	            
	        }
	        return head;
	    }
}
