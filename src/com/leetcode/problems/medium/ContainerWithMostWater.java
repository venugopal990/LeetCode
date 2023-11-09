package com.leetcode.problems.medium;

//https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-interview-150

public class ContainerWithMostWater {

	public static void main(String[] args) {
		ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
		System.out.println(containerWithMostWater.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));

	}
	
	
	public int maxArea(int[] height) {

		int maxValue=0, area=0 , left=0;
		int right = height.length -1;

		while(left<right) {
			area =  Math.min(height[left], height[right]) * (right -left);
			maxValue =  Math.max(maxValue, area);

			if(height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
		return maxValue;
	}

}
