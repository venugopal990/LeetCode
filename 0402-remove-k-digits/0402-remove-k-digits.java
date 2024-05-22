class Solution {
    public String removeKdigits(String num, int k) {


        if(num.length() == k){
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            char val = num.charAt(i);
            while(!stack.isEmpty() && stack.peek()>val && k>0){
                stack.pop();
                k--; 
            }
            stack.push(val);
        }

        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb  = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }    

        sb.reverse();

        while(sb.length()>1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.length()>0?sb.toString():"0";
        
    }
}