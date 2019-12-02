/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeAddBinaryString {
	public String addBinary(String a, String b) {
		StringBuilder output = new StringBuilder();
        String revA = reverse(a);
        String revB = reverse(b);
        int result = 0;
        int reminder = 0;
        
        int strLength = revA.length() > revB.length()? revA.length():revB.length();
        
        for(int i =0; i < strLength;i++){
            if((revA.length()>i) && (revB.length()>i)) {
                 result = (revA.charAt(i)-'0') + (revB.charAt(i)-'0') + reminder;
            } else if (revA.length()>i) {
                 result = (revA.charAt(i)-'0') + reminder;
            } else {
                 result = (revB.charAt(i)-'0') + reminder;
            }
               
            if (result>2) {
                reminder=1;
                output.append(1);
            } else if (result==2) {
                reminder = 1;
                output.append(0);
            } else if (result==1) {
                reminder = 0;
                output.append(1);
            } else {
                reminder = 0;
                output.append(0);
            }            
        }
               if (reminder>0) {
                   output.append(1);
               }
        
        return reverse(output.toString());
    }
    
    private String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--)
            sb.append(input.charAt(i));
        return sb.toString();
    } 
    
    
    /**
     * Recommended solution
     
    public String addBinary(String a, String b) {
        int n = a.length(), m = b.length();
        if ( n < m) return addBinary(b, a);
        int L = Math.max(n, m);
        
        StringBuilder sb = new StringBuilder();
        int carry = 0, j = m - 1;
        for (int i = L - 1; i >= 0; --i) {
            if (a.charAt(i) == '1') ++carry;
            if (j >=0 && b.charAt(j--) == '1') ++carry;
            
            if (carry % 2 == 1) sb.append('1');
            else sb.append('0');
            
            carry /= 2;
        }
        
        if (carry == 1) sb.append('1');
        sb.reverse();
        
        return sb.toString();
    }
    */
}