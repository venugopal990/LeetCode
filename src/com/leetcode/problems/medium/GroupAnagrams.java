package com.leetcode.problems.medium;

//https://leetcode.com/problems/group-anagrams/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static void main(String[]  args) {
		GroupAnagrams groupAnagrams_No_49_type_Medium = new GroupAnagrams();
		System.out.println(groupAnagrams_No_49_type_Medium.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
		//output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		
	}
	
	 public List<List<String>> groupAnagrams(String[] strs) {
		 if(strs == null || strs.length==0)
			 return new ArrayList<List<String>>();
		 
		 Map<String, List<String>> frequencyStringMap =  new HashMap<String, List<String>>();
		 for(String word : strs) {
			 String sortedString = sortByCharacters(word);			 
			 if(frequencyStringMap.containsKey(sortedString)) {
				 frequencyStringMap.get(sortedString).add(word);
			 }else {
				 List<String> wordList = new ArrayList<String>();
				 wordList.add(word);
				 frequencyStringMap.put(sortedString,wordList);
			 }
		 }
		return new ArrayList<List<String>>(frequencyStringMap.values());
	 }
	 
	 private String sortByCharacters(String word) {
		char[] charArrays = word.toCharArray();
		Arrays.sort(charArrays);
		return String.valueOf(charArrays);
	 }

}
