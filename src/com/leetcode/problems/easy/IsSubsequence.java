package com.leetcode.problems.easy;


public class IsSubsequence {

	public static void main(String[] args) {
		 
		IsSubsequence isSubsequence = new IsSubsequence();
		System.out.println(isSubsequence.isSubsequence("aec", "abcde"));

	}
	
	
	public boolean isSubsequence(String s, String t) {
				
		if(s.length() == 0)
            return true;
				
		int j=0;
		int count=0;
		for (int i = 0; i < t.length(); i++) {

			if(t.charAt(i) == s.charAt(j)) {
				count++;
				if(count == s.length()) {
					return true;
				}
				j++;
			}
		}
		
		return false;
    }

}
