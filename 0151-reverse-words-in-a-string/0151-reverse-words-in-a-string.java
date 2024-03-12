class Solution {
    public String reverseWords(String s) {
        String[] tempString = s.trim().split("\\s+");
		s="";
		for (int i = tempString.length-1; i >0; i--) {
			if(!tempString[i].isEmpty()) {
				s+=tempString[i]+" ";	
			}
		}
		
		return s+tempString[0];
    }
}