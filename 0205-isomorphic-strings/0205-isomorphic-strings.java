class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> sMap =  new HashMap<>();

        for(int i=0; i<s.length(); i++){

            if(!sMap.containsKey(s.charAt(i))){
                if(!sMap.containsValue(t.charAt(i))){
                    sMap.put(s.charAt(i), t.charAt(i));
                }else{
                    return false;
                }
            }else{
                if(sMap.get(s.charAt(i)) !=  t.charAt(i)){
                    return false;
                }
            }
        }

        
        return true;
    }
}