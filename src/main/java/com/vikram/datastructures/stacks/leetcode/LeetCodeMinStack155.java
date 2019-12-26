/**
 * 
 */
package com.vikram.datastructures.stacks.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 *
 */
public class LeetCodeMinStack155 {
	    
	    List<Integer> data; 
	    int min;

	    /** initialize your data structure here. */
	    public LeetCodeMinStack155() {
	        data = new ArrayList<Integer>();
	        min = Integer.MAX_VALUE;
	    }
	    
	    public void push(int x) {	        
	        if (x <= min) {
	        	data.add(min);
	            min = x;
	        }
	        data.add(x);
	    }
	    
	    public void pop() {
	    	if(data.remove(data.size()-1) == min) {
	            min = data.remove(data.size()-1);
	        }
	    }
	    
	    public int top() {
	        return data.get(data.size()-1);
	    }
	    
	    public int getMin() {
	        return this.min;
	    }
	}

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */

