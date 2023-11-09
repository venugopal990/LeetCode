package com.leetcode.problems.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&envId=top-interview-150

public class TwoSumII_InputArrayIsSorted {

	public static void main(String[] args) {
		TwoSumII_InputArrayIsSorted arrayIsSorted = new TwoSumII_InputArrayIsSorted();
		int[] result = arrayIsSorted.twoSum(new int[] {2,7,11,15},9);
		Arrays.stream(result).forEach(System.out::println);
	}
	
	
	public int[] twoSum(int[] numbers, int target) {
		
		int left = 0;
		int right = numbers.length-1;
		int result = 0 ;
		
		
		while(right>left) {
			
			result = numbers[right]+numbers[left];
			System.out.println("Left::"+numbers[left]+":right:"+numbers[right]+":target:"+target);
			
			if(result ==  target) {
				return new int[] {left+1,right+1};
			}
			
			if(result > target) {
				right--;
			}else if(result < target) {
				left++;
			}else {
				left++;
				right--;
			}
			
			
		}
		
		return new int[] {};
        
    }

}
