class Solution {
    public int evalRPN(String[] tokens) {
      
		if(tokens.length == 1 && !tokens[0].equals("+") && !tokens[0].equals("-") && !tokens[0].equals("*") && !tokens[0].equals("/"))
			return Integer.parseInt(tokens[0]);
		
        Stack<Integer> numbersStack = new Stack<>();
        
        for (String token : tokens) {
			if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
				numbersStack.push(Integer.parseInt(token));
			}else {
					int val2 = numbersStack.pop();
					int val1 = numbersStack.pop();
					numbersStack.push(performOperations(token, val1, val2));
			}
		}
        
        return numbersStack.pop();
    }
	
	
	private int performOperations(String token, int val1, int val2) {
		switch(token) {
		case "+":
			return val1+val2;
		case "-":
			return val1-val2;
		case "*":
			return val1*val2;
		case "/":
			return val1/val2;	
		default:
			break;
		}
		return 0;
	}
}