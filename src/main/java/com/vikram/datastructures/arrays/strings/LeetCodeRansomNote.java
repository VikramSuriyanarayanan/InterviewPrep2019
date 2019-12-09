package com.vikram.datastructures.arrays.strings;

import java.util.Arrays;

public class LeetCodeRansomNote {
	
	// Failed Attempt. Right answer is to save the value in hashmap and decrease.
	
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length())
            return false;
        
        if(magazine.equals(ransomNote))
            return true;

        
        char[] newMagchar = magazine.toCharArray();
        char[] newRanchar = ransomNote.toCharArray();
        
        Arrays.sort(newMagchar);
        Arrays.sort(newRanchar);
        
        String newMag = new String(newMagchar);
        String newRan = new String(newRanchar);
        
        for(int i=0;i<magazine.length()-ransomNote.length();i++) {
            if (newMag.substring(i,i+ransomNote.length()).equals(newRan))
                return true;
        }
        
        return false;
    }
	
	
	public boolean canConstruct2(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length())
            return false;
        
        if(magazine.equals(ransomNote))
            return true;
        
        for(int i=0;i<magazine.length()-ransomNote.length();i++) {
        	System.out.println(magazine.substring(i,ransomNote.length()+i));
            if (magazine.substring(i,i+ransomNote.length()).equals(ransomNote))
                return true;
        }
        
        return false;
    }
}
