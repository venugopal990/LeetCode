package com.leetcode.problems.easy;


//https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

public class RansomNote {

	public static void main(String[] args) {
		RansomNote ransomNote = new RansomNote();
		System.out.println(ransomNote.canConstruct("bhjdigif", "dbjdhdehgbcdjjgadeegdbegehjffie"));
		// TODO Auto-generated method stub

	}
	
	
	public boolean canConstruct(String ransomNote, String magazine) {
		
		int[] countArray = new int[26];
		
		for(char ch : magazine.toCharArray()) {
			countArray[ch- 'a']++;
		}
		
		for(char ch : ransomNote.toCharArray()) {
			countArray[ch - 'a']--;
			if(countArray[ch- 'a']<0) {
				return false;
			}
		}
		
		
		 return true;
		
		
		
    }

}
