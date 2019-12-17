/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeAddStrings415 {
public String addStrings(String num1, String num2) {
        
        int number1 = 0;
        int number2 = 0;
        for (int i=0;i<num1.length();i++) {
            int val = num1.charAt(i) - '0';
            number1 = number1*10 + val;
        }
        
        for (int j=0;j<num2.length();j++) {
            int val2 = num2.charAt(j) - '0';
            number2 = number2*10 + val2;
        }
        int result = number1+number2;
        return String.valueOf(result);
    }
}
