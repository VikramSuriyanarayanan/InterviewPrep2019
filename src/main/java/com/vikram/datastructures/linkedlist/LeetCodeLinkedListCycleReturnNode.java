/**
 * 
 */
package com.vikram.datastructures.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Remoz World
 *
 */
public class LeetCodeLinkedListCycleReturnNode {
	    private ListNode getIntersect(ListNode head) {
	        ListNode tortoise = head;
	        ListNode hare = head;

	        // A fast pointer will either loop around a cycle and meet the slow
	        // pointer or reach the `null` at the end of a non-cyclic list.
	        while (hare != null && hare.next != null) {
	            tortoise = tortoise.next;
	            hare = hare.next.next;
	            if (tortoise == hare) {
	                return tortoise;
	            }
	        }

	        return null;
	}

	    public ListNode detectCycle(ListNode head) {
	        if (head == null) {
	            return null;
	        }

	        // If there is a cycle, the fast/slow pointers will intersect at some
	        // node. Otherwise, there is no cycle, so we cannot find an entrance to
	        // a cycle.
	        ListNode intersect = getIntersect(head);
	        if (intersect == null) {
	            return null;
	        }

	        // To find the entrance to the cycle, we have two pointers traverse at
	        // the same speed -- one from the front of the list, and the other from
	        // the point of intersection.
	        ListNode ptr1 = head;
	        ListNode ptr2 = intersect;
	        while (ptr1 != ptr2) {
	            ptr1 = ptr1.next;
	            ptr2 = ptr2.next;
	        }

	        return ptr1;
	    }
	
	public ListNode detectCycleWithAux(ListNode head) {

		if (head == null || head.next == null)
			return null;
		
		Set<ListNode> aux = new HashSet<ListNode>();
		
		while(head.next !=null) {
			if(aux.contains(head))
				return head;
			
			aux.add(head);
			head = head.next;
		}

		return null;
	}
}
