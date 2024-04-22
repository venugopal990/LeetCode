class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] stringArray = s.split(" ");
		if(pattern.length() != stringArray.length)
			return false;

		Map<Character,String> wordPatternMap =  new HashMap<Character, String>();

		for(int i=0; i<pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = stringArray[i];
			if(wordPatternMap.containsKey(ch)) {
				if(!wordPatternMap.get(ch).equals(word)) {
					return false;
				}

			}else {
				if(wordPatternMap.containsValue(word))
					return false;
				wordPatternMap.put(ch, word);
			}
		}


		return true;
    }
}