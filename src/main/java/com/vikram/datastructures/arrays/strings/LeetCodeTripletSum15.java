/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Remoz World
 *
 *a+b+c = 0; find a,b,c
 */
public class LeetCodeTripletSum15 {
//	public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> list = new LinkedList<>();
//        Arrays.sort(nums);
//        for(int i = 0;i< nums.length-2;i++){
//        //    if(i > 0 && nums[i] == nums[i-1]) continue;                     //corner case {0,0,0,0}
//            twoSum(list, nums, i+1,nums.length-1,-nums[i]);
//        }
//        return list;
//    }
//    private void twoSum(List<List<Integer>> list, int[] nums,int low,int high,int target){
//        if(low > high) return;
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = low;i<= high;i++){
//            if(set.contains(target - nums[i])) {
//                list.add(Arrays.asList(-target,nums[i],target-nums[i]));
//        //        while(i+1 <= high && nums[i] == nums[i+1]) i++;             //corner case {0,0,0,0}
//            }else{
//                set.add(nums[i]);
//            }
//        }
//    }
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		if (nums.length<3)
			return null;
		
		for (int i=0;i<nums.length-2;i++) {
			if(i==0 || nums[i] != nums[i+1]) {
				int low = i+1;
				int high = nums.length-1;
				int sum = 0-nums[i];
				
				while(low < high) {
					if(nums[low]+nums[high] == sum) {
						output.add(Arrays.asList(nums[low],nums[high],nums[i]));
						while(nums[low]==nums[low+1]) low++;
						while(nums[high]==nums[high-1]) high--;
						low++;
						high--;
					} else if (nums[low]+nums[high] > sum)
						high--;
					else 
						low++;
					
				}
			}
		}
		
		return output;
	}
}
