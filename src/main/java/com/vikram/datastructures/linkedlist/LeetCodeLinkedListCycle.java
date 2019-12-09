/**
 * 
 */
package com.vikram.datastructures.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Remoz World
 *
 */
public class LeetCodeLinkedListCycle {
	public boolean doesCycleExist(ListNode head) {
		Set<ListNode> aux = new HashSet<ListNode>();
		if (head == null)
			return false;
		
		//1->2->5->7->9->1
		for(int i=0;head.next!=null;i++) {
			if (aux.contains(head))  {
				return true;
			} else {
				aux.add(head);
				head = head.next;
			}
		}
		
		return false;
	}
	
	public boolean doesCycleExistNoAux(ListNode head) {
		 if (head == null || head.next == null)
	            return false;
	        
	        ListNode curr = head;
	        ListNode nextNode = head.next;
	        
	        while((nextNode.next !=null) && (nextNode.next.next !=null) && (curr.next != null)) {
	            if ((curr.val == nextNode.val) && (curr.next == nextNode.next)) {
	                return true;
	            }
	            
	            curr = curr.next;
	            nextNode = nextNode.next.next;
	        }
	        
	        return false;
	    }
}
