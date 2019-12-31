/**
 * 
 */
package com.vikram.datastructures.queue.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.vikram.datastructures.linkedlist.ListNode;

/**
 * @author Remoz World
 *
 */
public class LeetCodeMergeKLinkedLists23 {
public ListNode mergeKLists(ListNode[] lists) {
        
        if (lists == null)
            return null;
        
        Comparator<ListNode> compar = (ListNode l1, ListNode l2) -> {
            return l1.val - l2.val;
        };
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(compar);
        ListNode output = new ListNode(0);
        ListNode dummy = output;
        
        for(ListNode listnode:lists) {
            if (listnode != null) {
                pq.offer(listnode);
            }
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
