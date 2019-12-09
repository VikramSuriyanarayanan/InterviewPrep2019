/**
 * 
 */
package com.vikram.datastructures.linkedlist;

/**
 * @author Remoz World
 *
 */
public class MainForLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCodeLinkedListCycleReturnNode llcr = new LeetCodeLinkedListCycleReturnNode();
		ListNode head = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		
		head.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		//System.out.println(llcr.detectCycle(head).val);
		
		LeetCodeReverseLinkedList lcrll = new LeetCodeReverseLinkedList();
		System.out.println(lcrll.reverseList(head).val);
		
		LeetCodeRemoveDuplicates lrd = new LeetCodeRemoveDuplicates();
		ListNode lrdhead = new ListNode(1);		
		ListNode ll2 = new ListNode(2);
		ListNode ll3 = new ListNode(3);
		ListNode ll4 = new ListNode(4);
		
		lrdhead.next = ll2;
		ll2.next = ll3;
		ll3.next = ll4;
		ll4.next = null;

		
		//lrd.removeElements(lrdhead, 1);
		
		LeetCodeOddEvenSplit loes = new LeetCodeOddEvenSplit();
		loes.oddEvenList(lrdhead);
		
		LeetCodeMergeLinkedList lcmll = new LeetCodeMergeLinkedList();
		ListNode merg1 = new ListNode(1);		
		ListNode m12 = new ListNode(3);
		ListNode m13 = new ListNode(5);
		ListNode m14 = new ListNode(7);
		
		merg1.next = m12;
		m12.next = m13;
		m13.next = m14;
		m14.next = null;
		
		ListNode m21 = new ListNode(2);		
		ListNode m22 = new ListNode(4);
		ListNode m23 = new ListNode(6);
		ListNode m24 = new ListNode(8);
		
		m21.next = m22;
		m22.next = m23;
		m23.next = m24;
		m24.next = null;
		
		System.out.println(lcmll.mergeTwoLists(merg1,m21).val);
	}

}
