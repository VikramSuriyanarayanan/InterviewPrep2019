package com.vikram.datastructures.arrays.strings;

/**
 * 
 * @author Remoz World
 Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 
 */
public class LeetCodeReverseInteger127 {
	
	/**
	 * WOrking sol.
	 * 
	 * @param x
	 * @return
	 */
    public int reverse(int x) {
        
        // 123
        int rev = 0;
        int rem = 0;
        
        if (x == 0)
            return 0;
        
        while(x !=0 ) {
            rem = x%10;
            x/=10;
            
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)
                return 0;
            
            rev = (rev*10) + rem;
        }
        return rev;
    }
    
	/**
	 * First attempt didnt work
	 * 
	 * @param x
	 * @return
	 */
	public int reverseAttempt1(int x) {
        String input = Integer.toString(x);
        StringBuffer sb = new StringBuffer();
        
        if (input.length()== 1) {
            return x;
        } 
        
        
        for(int i=input.length()-1; i >=0;i--) {
            if (input.toCharArray()[i] == '-') {
                i++;
                sb.append('-');
            } 
            
            sb.append(input.toCharArray()[i]);
        }
        
        return Integer.parseInt(sb.toString());
    }
}
