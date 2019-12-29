/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeRemoveKdigits402 {
	 public String removeKdigits(String num, int k) {
	        if(num.length() <=k)
	            return "0";
	        
	        char leftmin = num.charAt(0);
	        char rightmin = num.charAt(num.length()-1);
	        StringBuffer leftsb = new StringBuffer();
	        StringBuffer rightsb = new StringBuffer();

	        
	        for(int i=0;i<=k;i++) {
	          leftmin = leftmin<num.charAt(i)?leftmin:num.charAt(i);                
	        }
	        
	        for(int i=num.length()-1;i>=num.length()-k-1;i--) {
		          rightmin = rightmin<num.charAt(i)?rightmin:num.charAt(i);                
		    }
	        
	        leftsb.append(leftmin);
	        
	        for(int i=k+1;i<num.length();i++)
	            leftsb.append(num.charAt(i));
	        
	        for(int i=0;i<k;i++)
	            rightsb.append(num.charAt(i));
	        
	        rightsb.append(rightmin);

	        
	        int val = Integer.parseInt(leftsb.toString()) > Integer.parseInt(rightsb.toString()) ? Integer.parseInt(rightsb.toString()):Integer.parseInt(leftsb.toString()); 
	        return Integer.toString(val);
	    }
}
