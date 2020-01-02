package com.vikram.datastructures.linkedlist;

public class LeetCodeCopyRandomList138 {
	 public Node copyRandomList(Node head) {        
	        if (head == null)
	            return null;
	        
	        Node oldNode = head;
	        Node newNode = new Node(oldNode.val,null,null);
	        hm.put(oldNode,newNode);
	        
	        while(oldNode != null) {
	            newNode.random = this.checkIfNodeExists(oldNode.random);
	            newNode.next = this.checkIfNodeExists(oldNode.next);
	            
	            oldNode = oldNode.next;
	            newNode = newNode.next;            
	        }
	        
	        return hm.get(head);
	    }
	    
	    public Node checkIfNodeExists(Node oldNode) {
	        if (oldNode == null)
	            return null;
	        
	        if(!hm.containsKey(oldNode))
	            hm.put(oldNode, new Node(oldNode.val,null,null));
	        
	        return hm.get(oldNode);
	    }
}
