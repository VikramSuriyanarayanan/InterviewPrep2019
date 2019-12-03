package com.vikram.datastructures.arrays.strings;

public class LeetCodePalindrome125 {
	public boolean isPalindrome(String s) {
        if((s==null) || (s.equals(""))) 
           return true;
           
         StringBuffer sb = new StringBuffer();
         String alphaOnly = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
          
          for (int i=alphaOnly.length()-1;i>=0;i--) {
              sb.append(alphaOnly.toCharArray()[i]);
          }
          System.out.println(sb.toString());
         return sb.toString().equalsIgnoreCase(alphaOnly);
    }
}
