package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/3sum/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		ThreeSum threeSum = new ThreeSum();
		System.out.println(threeSum.threeSum(new int[] {-1,0,1,2,-1,-4}));
	}
	
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		if(nums == null || nums.length < 3 ) {
			return new ArrayList<>();
		}
		
		Set<List<Integer>> resultSet = new HashSet<List<Integer>>(); 
		
		Arrays.sort(nums);
		
		Arrays.stream(nums).forEach(System.out::println);
		
		
		int left = 0;
		int right = 0;
		int result = 0 ;
		
		for (int i = 0; i < nums.length-2; i++) {

			left = i+1;
			right = nums.length-1;

			while(right>left) {

				result = nums[left]+nums[right]+nums[i];
				System.out.println("Left::"+nums[left]+":right:"+nums[right]+":i:"+nums[i]+"::result:"+result);

				if(result ==  0) {
					resultSet.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
					left++;
					right--;
				}else if(result > 0) {
					right--;
				}else{
					left++;
				}

			}
		}

			
			return new ArrayList<>(resultSet);

		}

}
