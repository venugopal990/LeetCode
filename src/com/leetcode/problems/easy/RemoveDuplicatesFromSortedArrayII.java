package com.leetcode.problems.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {
		
		RemoveDuplicatesFromSortedArrayII arrayII = new RemoveDuplicatesFromSortedArrayII();
		arrayII.removeDuplicates(new int[] {1,1,1,2,2,3});

	}
	
	
	public int removeDuplicates(int[] nums) {
		
		if (nums.length == 0) {
	        return 0; // If the array is empty, there are no duplicates to remove.
	    }

	    int uniqueCount = 1; // Initialize with 1 since the first element is always unique.

	    for (int i = 1; i < nums.length; i++) {
	    	System.out.println("out:nums[i]:"+nums[i]+">>>nums[i - 1]>"+nums[i - 1]+"::::::"+(nums[i] != nums[i - 1]));
	        if (nums[i] != nums[i - 1]) {
	            nums[uniqueCount] = nums[i];
	            uniqueCount++;
	        }
	    }

	    Arrays.stream(nums).forEach(System.out::println);
	    System.out.println("uniqueCount::"+uniqueCount);
	    return uniqueCount;      
        
    }

}
