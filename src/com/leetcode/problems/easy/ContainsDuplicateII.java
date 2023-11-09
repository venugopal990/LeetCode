package com.leetcode.problems.easy;

import java.util.HashMap;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
		
		System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));

	}
	
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if(countMap.containsKey(nums[i]) && (Math.abs(i - countMap.get(nums[i])) <=k) )
				return true;
			else
				countMap.put(nums[i], i);
			
		}
		return false;
	}

}
