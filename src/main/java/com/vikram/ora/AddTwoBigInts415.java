package com.vikram.ora;

/**Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
**/
public class AddTwoBigInts415 {
public String addStrings(String num1, String num2) {
        
        String rev1 = reverse(num1);
        String rev2 = reverse(num2);
        
        int max_len = rev1.length()>rev2.length()?rev1.length():rev2.length();
        StringBuffer output = new StringBuffer();
        int carry = 0;
        
        for(int i=0;i<max_len;i++) {
            int ans = 0;
            
            if(i<rev1.length()) 
                ans += rev1.charAt(i) - '0';
            
            
            if(i<rev2.length()) 
                ans += rev2.charAt(i) - '0';
            
            if(carry >0) {
                ans += carry;
                carry = 0;
            }
            
            if(ans>=10) {
                ans %= 10;
                carry = 1;
            } 
                
            output.append(Integer.toString(ans));
        }
        
        if(carry >0)
            output.append("1");
        
        return reverse(output.toString());
    }
    
    
    public String reverse(String num) {
        StringBuffer sb = new StringBuffer();
        
        for(int i= num.length()-1;i>=0;i--) {
            sb.append(num.charAt(i));
        }
        
        return sb.toString();
    }
}
