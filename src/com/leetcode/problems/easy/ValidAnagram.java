package com.leetcode.problems.easy;


public class ValidAnagram {

	public static void main(String[] args) {
		ValidAnagram validAnagram = new ValidAnagram();
		System.out.println(validAnagram.isAnagram("anagram", "nagaram"));

	}
	
	
	public boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length())
			return false;
		
		int[] frequencyCount =  new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			frequencyCount[s.charAt(i) - 'a']++;
			frequencyCount[t.charAt(i) - 'a']--;
		}
		
		for(int count : frequencyCount) {
			if(count !=  0)
				return false;
		}
		return true;
    }

}
