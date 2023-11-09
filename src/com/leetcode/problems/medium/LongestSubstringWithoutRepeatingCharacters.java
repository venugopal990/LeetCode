package com.leetcode.problems.medium;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1091547303/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		
		System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab"));

	}
	
	
	public static int lengthOfLongestSubstring(String s) {
		
		int maxSubString = 0;
		int left =0;
		int right = 0;
		Set<Character> charSet = new HashSet<Character>();
		
		
		while( right < s.length()) {
			if(!charSet.contains(s.charAt(right))) {
				charSet.add(s.charAt(right));
				maxSubString = Math.max(maxSubString, charSet.size());
				right++;
			}else {
				charSet.remove(s.charAt(left));
				left++;
			}

			
		}
		
		return maxSubString ; 
		
    }

}
