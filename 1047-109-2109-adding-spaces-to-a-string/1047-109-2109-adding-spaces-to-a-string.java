class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder result =  new StringBuilder();
        int spaceTrack = 0;
        char[] sArray =  s.toCharArray();
        for(int i=0;i<sArray.length;i++){
            if(spaceTrack<spaces.length && i == spaces[spaceTrack]){
                result.append(" ");
                spaceTrack++;
            }
            result.append(sArray[i]);
        }

        return result.toString();
        
    }
}