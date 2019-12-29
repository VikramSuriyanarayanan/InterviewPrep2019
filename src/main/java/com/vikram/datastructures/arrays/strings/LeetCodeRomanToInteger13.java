/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Remoz World
 *
 */
public class LeetCodeRomanToInteger13 {
	Map<Character,Integer> hm = new HashMap<Character, Integer>();
    
    public LeetCodeRomanToInteger13() {
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
    }

    public int romanToInt(String s) {
    	  int sum = 0;
          if((s == null) ||(s.length() <1))
              return 0;
          
          for(int i=0;i<s.length()-1;i++) {
              if (hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))) {
                  sum -= hm.get(s.charAt(i));
              } else {
                  sum += hm.get(s.charAt(i));
              }
          }
          
          return sum+hm.get(s.charAt(s.length()-1));         
      }
}
