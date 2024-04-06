class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stackIndex = new Stack<>();
        List<Integer> invalidIndexList = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stackIndex.push(i);
            }else if(s.charAt(i) == ')'){
                if(!stackIndex.isEmpty()){
                    stackIndex.pop();
                }else{
                    invalidIndexList.add(i);
                }
            }
        }

        while(!stackIndex.isEmpty()){
            invalidIndexList.add(stackIndex.pop());
        }

        Set<Integer> set = new HashSet<>(invalidIndexList);
        StringBuilder sb = new StringBuilder();

        for(int p=0;p<s.length();p++){
            if(!set.contains(p)){
                sb.append(s.charAt(p));
            }
        }
       

        return sb.toString();
    }

    
}