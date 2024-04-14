class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longestLength = Integer.MIN_VALUE;
        if(s.length()==0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        char[] charArray = s.toCharArray();
        int i = 0,j=0;

        while(j < charArray.length){

            if(!set.contains(charArray[j])){
                set.add(charArray[j]);
                longestLength = Math.max((j-i)+1,longestLength);
                j++;
            }else{
                set.remove(charArray[i]);
                i++;
            } 
        }
        return longestLength; 
    }
}