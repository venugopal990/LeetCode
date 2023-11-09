package com.leetcode.problems.medium;

import java.util.HashMap;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();

        for(int num : nums){
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num)+1);
            }else{
                countMap.put(num,1);
            }
        }
        
    
		return countMap.entrySet().stream().filter(e -> (e.getValue()!=3)).map(e -> e.getKey()).findFirst().get();

        

    }
}
