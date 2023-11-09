package com.leetcode.problems.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome validPalindrome = new ValidPalindrome();
		System.out.println(validPalindrome.isPalindrome("race a car"));

	}
	
	
	public boolean isPalindrome(String s) {

		int left=0;
		int right=s.length()-1;

		while(left<right) {

			if(!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}else if(!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}else {
				if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) 
					return false;
				left++;
				right--;
			}
		}
		return true;

	}

}
