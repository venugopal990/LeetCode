package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-interview-150

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
		System.out.println(">final>>"+longestConsecutiveSequence.longestConsecutive(new int[] {5,4,6,1,3,2}));

	}
	
	public int longestConsecutive(int[] nums) {
	    int longestLength = 0;
	    Map<Integer, Boolean> numberTravelledMap = new HashMap<>();

	    for (int num : nums) {
	        numberTravelledMap.put(num, Boolean.FALSE);
	    }

	    for (int num : nums) {
	        if (numberTravelledMap.get(num)) {
	            continue; // Skip numbers that have been marked as "travelled"
	        }

	        int currentLength = 1;
	        int nextNum = num + 1;

	        // Check in the forward direction
	        while (numberTravelledMap.containsKey(nextNum) && !numberTravelledMap.get(nextNum)) {
	            currentLength++;
	            numberTravelledMap.put(nextNum, Boolean.TRUE);
	            nextNum++;
	        }

	        int prevNum = num - 1;

	        // Check in the reverse direction
	        while (numberTravelledMap.containsKey(prevNum) && !numberTravelledMap.get(prevNum)) {
	            currentLength++;
	            numberTravelledMap.put(prevNum, Boolean.TRUE);
	            prevNum--;
	        }

	        longestLength = Math.max(longestLength, currentLength);
	    }

	    return longestLength;
	}


}
