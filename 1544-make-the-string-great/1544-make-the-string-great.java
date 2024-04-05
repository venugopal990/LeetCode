class Solution {
    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()){
                char topElement = stack.peek();
                int j=(int)topElement;
                int k=(int)s.charAt(i);
                 if((j >= 97 && j <= 122 && j-32 == k) || (j >= 65 && j <= 90 && j+32 == k)){
                    stack.pop();
                    continue;
                 }
                 stack.push(s.charAt(i));
            }else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}