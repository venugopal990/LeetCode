package com.leetcode.problems.easy;

import java.util.HashMap;

//https://leetcode.com/problems/contains-duplicate/description/
//Time Complexity : O(n)

public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate containsDuplicate  = new ContainsDuplicate();
		System.out.println(containsDuplicate.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));

	}
	
	
	public boolean containsDuplicate(int[] nums) {
		
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if(countMap.containsKey(nums[i]))
				return true;
			else
				countMap.put(nums[i], 1);
				
		}
		return false;
    }

}
