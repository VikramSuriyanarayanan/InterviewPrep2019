/**
 * 
 */
package com.vikram.datastructures.binary.search;

/**
 * @author Remoz World
 *
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
 */
public class LeetCodeSqrt69 {
	 public int mySqrt(int x) {
	        if (x<2)
	            return x;
	        
	        int lo = 2, hi = x/2;
	        long num;
	        
	        while(lo <= hi) {
	            int mid = lo+(hi-lo)/2;
	            num = (long) mid*mid;
	            if (x == num)
	                return mid;
	            else if (x > num) {
	                lo = mid+1;
	            } else if (x < num) {
	                hi = mid-1;
	            }
	        }
	        
	        return hi;
	    }
}
