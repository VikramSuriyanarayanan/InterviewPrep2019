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

		List<List<String>> listOut = new ArrayList<List<String>>();
		HashMap<String,List<String>> hash = new HashMap<String, List<String>>();

		for(int i=0;i<strs.length;i++) {
			char[] sortedarr = strs[i].toCharArray();
			Arrays.sort(sortedarr);
			String s = new String(sortedarr);

			if(hash.containsKey(s)) {
				List ret = hash.get(s);
				ret.add(strs[i]);
				hash.put(s,ret);
			} else {
				List<String> subAns = new ArrayList<String>();
				subAns.add(strs[i]);
				hash.put(s,subAns);
			}
		}

		for (Map.Entry<String,List<String>> entry : hash.entrySet())  
			listOut.add(entry.getValue()); 

		return listOut;
	}
}
