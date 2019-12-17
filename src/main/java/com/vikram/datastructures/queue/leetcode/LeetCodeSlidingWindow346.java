/**
 * 
 */
package com.vikram.datastructures.queue.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Remoz World
 *
 */
public class LeetCodeSlidingWindow346 {
	//1, 10, 3, 5 
    private Queue<Double> queue;
    private int size;
    private Double sum;

    /** Initialize your data structure here. */
    public LeetCodeSlidingWindow346(int size) {
        this.queue = new LinkedList<Double>();
        this.size = size;
        this.sum = 0.0;
    }
    
    public double next(int val) {
        
        if(queue.size() != size) {
            queue.offer(new Double(val));
            sum += val;
        } else {
            Double subVal = queue.poll();
            sum -=subVal;
            queue.offer(new Double(val));
            sum += val;
        }
        
        return new Double(sum/queue.size());            
    }
}
