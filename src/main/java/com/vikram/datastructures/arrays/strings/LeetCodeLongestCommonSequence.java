/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeLongestCommonSequence {

	 public String longestCommonPrefix(String[] strs) {
	        
	        String prefix = strs[0]; //flower
	        
	        for(int i=0;i<strs.length;i++) {
	            int lengthToTraverse = strs[i].length() <= prefix.length() ? strs[i].length():prefix.length();
	            int j=0;
	            
	            while((lengthToTraverse !=0) && (strs[i].toCharArray()[j] == prefix.toCharArray()[j])) {
	                lengthToTraverse--;
	                j++;
	            }
	            
	            prefix = prefix.substring(0,j);
	        }
	        
	        return prefix;
	    }
	 
	 public String recommendedSol(String[] strs) {
		 if (strs == null || strs.length == 0)
	            return "";
	        String pre = strs[0];
	        for(int i = 1; i< strs.length; i++) {
	            while(strs[i].indexOf(pre) != 0)
	                pre = pre.substring(0, pre.length()-1);
	        }
	        return pre;
	 }
}
