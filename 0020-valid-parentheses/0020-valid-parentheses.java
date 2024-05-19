class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> map =  new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack =  new Stack<>();

        for(int i=0;i<s.length();i++){
            char charValue = s.charAt(i);
            if(map.containsKey(charValue)){
                stack.push(map.get(charValue));
            }else{
                if(!stack.isEmpty() && charValue == stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            } 
        }


        return stack.isEmpty()?true:false;
        
    }
}