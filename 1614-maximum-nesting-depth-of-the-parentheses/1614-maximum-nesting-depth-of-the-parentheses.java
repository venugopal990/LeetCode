class Solution {

    //TC: O(n) SC:O(1)
    public int maxDepth(String s) {
        int count=0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            char singleChar = s.charAt(i);
            if(singleChar == '('){
                max++;
                if(count>0){
                    count--;
                }
            }else if(singleChar == ')'){
                if(max>0){
                    max--;
                    count++;
                }
            }
        }
        return count;
    }


    /*
    Using Stack
    public int maxDepth(String s) {
        int count=0;
        Stack<Character> stack =  new Stack<>();
        for(int i=0;i<s.length();i++){
            char singleChar = s.charAt(i);
            if(singleChar == '('){
                stack.push(')');
                if(count>0){
                    count--;
                }
            }else if(singleChar == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                    count++;
                }
            }

        }
        return count;
    }*/

}