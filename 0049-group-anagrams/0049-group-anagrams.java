class Solution {
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