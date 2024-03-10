class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
		
		Arrays.sort(strs);
		
		char[] firstWord = strs[0].toCharArray();
		char[] lastWord = strs[strs.length-1].toCharArray();
		
		
		for (int i = 0; i < firstWord.length; i++) {
			
			if(firstWord[i] == lastWord[i]) {
				result+=firstWord[i];
			}else {
				break;
			}
			
		}
		
		
		
		return result;
    }
}