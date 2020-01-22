/**
 * 
 */
package com.vikram.appl.string;

import java.util.Arrays;

/**
 * @author Remoz World
 * You have an array of logs.  Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier.  Then, either:

Each word after the identifier will consist only of lowercase letters, or;
Each word after the identifier will consist only of digits.
We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.

Return the final order of the logs.

 

Example 1:

Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 
 */
public class LogReOrdering937 {
	//-1 : o1 < o2
	// 0 : o1 == o2
	// +1 : o1 > o2
	 public String[] reorderLogFiles(String[] logs) {
		 Arrays.sort(logs, (log1, log2) -> {
	            String[] words1 = log1.split(" ", 2);
	            String[] words2 = log2.split(" ", 2);
	            
	            boolean flag1 = Character.isDigit(words1[1].charAt(0));
	            boolean flag2 = Character.isDigit(words2[1].charAt(0));
	            
	            // If both are digit log
	            if(flag1 && flag2)
	                return 0;
	            
	            // if both are letter log
	            if(!flag1 && !flag2){
	                int compare = words1[1].compareTo(words2[1]);
	                return compare == 0? words1[0].compareTo(words2[0]):compare;
	            }
	                

	            
	            // if one digit log and one letter log
	            if(flag1 && !flag2){
	                return 1;
	            }else{
	                return -1;
	            }            
	            
	        });
	        
	        return logs;
	    }
	 
	 public Integer[] ascendingOrderSortingWithComparator(int[] nums) {
		 Integer[] sorted = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		 Arrays.sort(sorted, (val1,val2) -> {
			 return (val1<val2)?-1:(val1==val2)?0:1;
		 });
		 return sorted;
	 }
}
