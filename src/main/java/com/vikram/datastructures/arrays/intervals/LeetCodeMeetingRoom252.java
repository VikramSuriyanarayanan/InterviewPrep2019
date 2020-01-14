/**
 * 
 */
package com.vikram.datastructures.arrays.intervals;

import java.util.Arrays;

/**
 * @author Remoz World
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

Example 1:

Input: [[0,30],[5,10],[15,20]]
Output: false
Example 2:

Input: [[7,10],[2,4]]
Output: true
 */
public class LeetCodeMeetingRoom252 {
	public boolean canAttendMeetings(int[][] intervals) {
        
        if (intervals.length < 1)
            return true;
        
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0]<intervals[i-1][1])
                return false;
        }
        
        return true;
    }
}
