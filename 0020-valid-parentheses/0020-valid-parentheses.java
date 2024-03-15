class Solution {
   public   boolean isValid(String s) {
       HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		
        char[] charArray = s.toCharArray();
        Stack<Character> charStack = new Stack<>();
        
        for (char c : charArray) {
        	char closingBraces = 0;
        	if(map.get(c) != null)
        		closingBraces = map.get(c);
        	if(closingBraces != 0) {
        		charStack.push(closingBraces);
        	}else {
        		if(!charStack.isEmpty()  && c == charStack.peek()) {
        			charStack.pop();
        		}else {
        			return false;
        		}
        	}
		}
        
		return charStack.isEmpty();
    }
}