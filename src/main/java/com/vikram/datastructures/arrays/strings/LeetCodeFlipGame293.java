/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 *
 */
public class LeetCodeFlipGame293 {
	public List<String> generatePossibleNextMoves(String s) {
	    List list = new ArrayList();
	    for (int i=-1; (i = s.indexOf("++", i+1)) >= 0; )
	        list.add(s.substring(0, i) + "--" + s.substring(i+2));
	    return list;
	}
}
