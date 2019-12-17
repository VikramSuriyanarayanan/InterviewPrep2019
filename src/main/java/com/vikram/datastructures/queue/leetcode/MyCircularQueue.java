	/**
 * 
 */
package com.vikram.datastructures.queue.leetcode;

/**
 * @author Remoz World
 *
 */
public class MyCircularQueue {
	 private int[] circularQueue;
	    private int head;
	    private int tail;
	    private int size;

	    /** Initialize your data structure here. Set the size of the queue to be k. */
	    public MyCircularQueue(int k) {
	        circularQueue = new int[k];
	        head = 0;
	        tail = 0;
	        size = k;
	    }
	    
	    /** Insert an element into the circular queue. Return true if the operation is successful. */
	    public boolean enQueue(int value) {
	        if(isFull())
	        	return false;

	        circularQueue[tail] = value;
	        // head = 0, tail = 0
	        if (tail == size) {
	        	tail = 0;
	        } else {
	        	tail++;
	        }
	        
	        return true;
	    }
	    
	    /** Delete an element from the circular queue. Return true if the operation is successful. */
	    public boolean deQueue() {
	        if (head == tail)
	            return false;
	        
	        if (head == size) {
	        	head = 0;
	        } else {
	        	head++;
	        }
	        
	        return true;
	    }
	    
	    /** Get the front item from the queue. */
	    public int Front() {
	        if (head == tail)
	            return -1;
	        return circularQueue[head];
	    }
	    
	    /** Get the last item from the queue. */
	    public int Rear() {
	        if (head == tail)
	            return -1;
	        
	        return circularQueue[tail];
	    }
	    
	    /** Checks whether the circular queue is empty or not. */
	    public boolean isEmpty() {
	        return head==tail;
	    }
	    
	    /** Checks whether the circular queue is full or not. */
	    public boolean isFull() {
	        return (((tail > size-1) && (head == 0)) || ((head > size-1) && (tail == 0)) || (head+tail > size-1));
	    }
}
