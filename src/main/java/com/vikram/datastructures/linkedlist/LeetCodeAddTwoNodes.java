/**
 * 
 */
package com.vikram.datastructures.linkedlist;

/**
 * @author Remoz World
 *
 */
public class LeetCodeAddTwoNodes {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode output = new ListNode(0);
	        ListNode dummy = output;
	        int carry = 0;
	        
	        while((l1!=null) || (l2 !=null)) {
	            
	            int l2val = (l2 == null)? 0: l2.val;
	            int l1val = (l1 == null)? 0: l1.val;

	            int sum = l1val + l2val + carry;
	            if (sum > 10) {
	            	sum = sum%10;
	            	carry = 1;
	            } else 
	            	carry = 0;
	            
	            output.next = new ListNode(sum);
	            output = output.next;
	            
	            if (l1 != null)
	                l1 = l1.next;
	            
	            if(l2 != null)
	                l2 = l2.next;
	            
	        }
	        
	        if (carry == 1) {
	            output.next = new ListNode(1);
	        	output = output.next;
	        }
	        
	        return dummy.next;
	    }
}
