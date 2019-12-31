/**
 * 
 */
package com.vikram.datastructures.linkedlist;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author Remoz World
 *
 *Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 */
public class LeetCodeMergeKLinkedLists23 {

	 public ListNode mergeKLists(ListNode[] lists) {
	        Comparator<ListNode> compar = (ListNode l1, ListNode l2) -> {
	            return l1.val - l2.val;
	        };
	        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(compar);
	        ListNode output = new ListNode(0);
	        ListNode dummy = output;
	        
	        for(ListNode listnode:lists) {
	            pq.offer(listnode);
	        }
	        
	        while(!pq.isEmpty()) {
	            ListNode list = pq.poll();
	            output.next = list;
	            output = output.next;
	            if(list.next !=null) {
	                pq.offer(list.next);
	            }
	        }
	
	        return dummy.next;
	    }
}
