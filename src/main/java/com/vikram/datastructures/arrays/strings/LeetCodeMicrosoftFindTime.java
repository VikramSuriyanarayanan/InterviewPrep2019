/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeMicrosoftFindTime {
	
	// time is an integer between 0 - 12
	// offset can be -ve or +ve
	// Add the offset to the input time and return the new time along with the AM/PM indication in 12 hour format."
	// Example: return "5 PM"
	// time 8 ; isAM = false ; offset -5,+3
	public String findTime (int time, boolean isAm, int offset) {
		
		time = time+offset;
		
		if (time > 0) {
			time = time%12;
		} else {
			time = (time+12)%12;
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(time).append(" ").append(isAm?"AM":"PM");
		return sb.toString();
	}
}
