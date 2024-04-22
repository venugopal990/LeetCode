class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] random = new int[26];

        for(char ch : magazine.toCharArray()){
            random[ch - 'a']++;
        }
    
        for(char ch : ransomNote.toCharArray()){
            random[ch - 'a']--;
            if(random[ch - 'a']<0){
                return false;
            }
        }

    
        return true;
        
    }
}