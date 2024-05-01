class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chArray = word.toCharArray();
        int i=0;
        int j = word.indexOf(ch);

        while(j!=-1 && i<j){
            char temp = chArray[i];
            chArray[i] = chArray[j];
            chArray[j] = temp;
            i++;
            j--;
        } 

        
        return String.valueOf(chArray);
    }
}