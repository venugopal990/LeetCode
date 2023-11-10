package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		
		IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
		System.out.println(isomorphicStrings.isIsomorphic("badc", "baba"));

	}
	
	
	public boolean isIsomorphic(String s, String t) {
		
		if (s.length() != t.length())
	        return false;

	    Map<Character, Character> sToTMap = new HashMap<>();
	    Map<Character, Character> tToSMap = new HashMap<>();

	    for (int i = 0; i < s.length(); i++) {
	        char charS = s.charAt(i);
	        char charT = t.charAt(i);

	        if (sToTMap.containsKey(charS)) {
	            if (sToTMap.get(charS) != charT)
	                return false;
	        } else {
	            sToTMap.put(charS, charT);
	        }

	        if (tToSMap.containsKey(charT)) {
	            if (tToSMap.get(charT) != charS)
	                return false;
	        } else {
	            tToSMap.put(charT, charS);
	        }
	    }

	    return true;
    }

}
