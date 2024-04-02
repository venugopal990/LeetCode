class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> sIsomorphicMap = new HashMap<>();
        Map<Character,Character> tIsomorphicMap = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(int i=0;i<sArray.length;i++){
            if(sIsomorphicMap.get(sArray[i])!=null){
                if(!sIsomorphicMap.get(sArray[i]).equals(tArray[i]))
                    return false;
            }else{
                sIsomorphicMap.put(sArray[i],tArray[i]);
            }

            if(tIsomorphicMap.get(tArray[i])!=null){
                if(! tIsomorphicMap.get(tArray[i]).equals(sArray[i])){
                    return false;
                }
            }else{
                tIsomorphicMap.put(tArray[i],sArray[i]);
            }
        }

        return true;
    }
}