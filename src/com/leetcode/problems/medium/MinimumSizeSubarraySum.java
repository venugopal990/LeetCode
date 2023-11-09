package com.leetcode.problems.medium;


//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		
		System.out.println(MinimumSizeSubarraySum .minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
		

	}
	
	public static int minSubArrayLen(int target, int[] nums) {
		
		
		 int minSubArraySize=Integer.MAX_VALUE;
		 int sum=0;
		 int left=0;
		 
		 for (int right = 0; right < nums.length; right++) {
			 
			 sum+= nums[right];
			 
			 while(sum >= target) {
				 
				 minSubArraySize = Math.min(((right - left)+1),minSubArraySize);
				 sum = sum - nums[left];
				 left++;
			 }
			 
			
		}
		 
		return minSubArraySize== Integer.MAX_VALUE ? 0: minSubArraySize;
        
    }

}
