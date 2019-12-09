/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeStringAtoI8 {
	
	 public int myAtoi(String str) {
         if (str.length()<1)
             return 0;
         
         double output = 0;
         int i=0;
         boolean negation = false;
         
         String trimmedInput = str.trim();
         
         if (trimmedInput.toCharArray()[0] == '-') {
           negation = true;
           i++;
         }
         
         while(trimmedInput.toCharArray()[i]>='0' && trimmedInput.toCharArray()[i]<='9' && trimmedInput.length()>i){
             output = output*10 + (trimmedInput.charAt(i)-'0');
             i++;
         }
         if(negation)
             output = output*-1;
         
         if (output>Integer.MAX_VALUE)
             return Integer.MAX_VALUE;
         
         if (output<Integer.MIN_VALUE)
             return Integer.MIN_VALUE;
         
         return (int) output;
     }
	
//	public int myAtoi(String str) {
//        StringBuffer output = new StringBuffer();
//        
//        if (str.length() < 1) 
//            return 0;
//        
//        for(int i =0; i<str.length();i++) {
//            if((str.toCharArray()[i]-'0') < 10 || str.toCharArray()[i] =='-') {
//                output.append(str.toCharArray()[i]);
//                
//                if (Integer.parseInt(output.toString()) > Integer.MAX_VALUE/10)
//                    return Integer.MAX_VALUE;
//                
//                 if (Integer.parseInt(output.toString()) < Integer.MIN_VALUE/10) 
//                    return Integer.MIN_VALUE;
//            }
//        }
//        
//        return Integer.parseInt(output.toString());
//    }
}
