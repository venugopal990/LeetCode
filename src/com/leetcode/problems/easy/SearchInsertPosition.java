package com.leetcode.problems.easy;


//https://leetcode.com/problems/search-insert-position/description/?envType=study-plan-v2&envId=top-interview-150

public class SearchInsertPosition {

	public static void main(String[] args) {
		SearchInsertPosition insertPosition = new SearchInsertPosition();
		System.out.println(insertPosition.searchInsert(new int[] {1,3}, 2));

	}
	
	
	public int searchInsert(int[] nums, int target) {
		
		int left = 0 ;
		int right = nums.length-1;
		int mid= 0 ;
		
		while(left<right) {
			mid = (left + right)/2;
			if(nums[mid] ==  target) {
				return mid;
			}else if(nums[mid] <  target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		
		if(target > nums[left]) {
			return left+1;
		}else {
			return left;
		}
    }

}
