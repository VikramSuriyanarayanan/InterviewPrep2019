/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Remoz World
 *
 */
public class LeetCodeGroupAnagrams49 {

	 public List<List<String>> groupAnagrams(String[] strs) {
	        
	        String[] output = new String[strs.length];
	        List<List<String>> listOut = new ArrayList<List<String>>();
	        HashMap<String,List<String>> hash = new HashMap<String, List<String>>();
	        
	        for(int i=0;i<strs.length;i++) {	            
	            Arrays.sort(strs[i].toCharArray());
	        }
	        
	        System.out.println(Arrays.deepToString(strs));
	        for(int j=0;j<output.length;j++) {
	            if(hash.containsKey(output[j])) {
	                List ret = hash.get(output[j]);
	                ret.add(strs[j]);
	                hash.put(output[j],ret);
	            } else {
	                List<String> subAns = new ArrayList<String>();
	                subAns.add(strs[j]);
	                hash.put(output[j],subAns);
	            }
	        }
	        
	        for (Map.Entry<String,List<String>> entry : hash.entrySet())  
	            listOut.add(entry.getValue()); 
	        
	        return listOut;
	    }
}
