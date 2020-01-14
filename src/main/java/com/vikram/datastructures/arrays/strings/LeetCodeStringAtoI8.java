/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 *Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 */
public class LeetCodeStringAtoI8 {

	public int myAtoi(String str) {
		if (str.trim().length()<1)
			return 0;

		double output = 0;
		int i=0;
		boolean negation = false;

		String trimmedInput = str.trim();

		if (trimmedInput.toCharArray()[0]  == '-') {
			negation = true;
			i++;
		} else if (trimmedInput.toCharArray()[0]  == '+') {
			i++;
		}

		while(i<trimmedInput.length() && trimmedInput.toCharArray()[i]>='0' && trimmedInput.toCharArray()[i]<='9'){
			output = output*10 + (trimmedInput.charAt(i)-'0');
			i++;
		}

		if (output>Integer.MAX_VALUE && negation)
			return Integer.MIN_VALUE;

		if (output>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if(negation)
			output = output*-1;

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
