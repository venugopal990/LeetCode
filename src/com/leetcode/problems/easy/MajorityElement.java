package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		MajorityElement majorityElement = new MajorityElement();
		System.out.println("Result:"+majorityElement.majorityElement(new int[] {3,2,3}));

	}
	
	public int majorityElement(int[] nums) {
		
		HashMap<Integer, Integer> countMap =  new HashMap<Integer, Integer>();
		
		int target  =  Math.round((float)(nums.length/2));
		
		for(int num : nums) {
			if(countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num)+1);
			}else {
				countMap.put(num, 1);
			}
		}
		
		System.out.println(target);
		System.out.println(countMap);
		
		
		
		return countMap.entrySet().stream().filter(e -> (e.getValue()>target)).map(Map.Entry::getKey).findFirst().get();
        
    }

}
