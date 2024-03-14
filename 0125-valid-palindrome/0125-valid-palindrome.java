class Solution {
    public boolean isPalindrome(String s) {
        
       s = s.toLowerCase();
    	char[] charArray = s.toCharArray();
    	int i=0;
    	int j = charArray.length-1;
    	
    	
    	while(i<j) {
    		if((charArray[i] >='a' && charArray[i] <='z') || (charArray[i] >=48 && charArray[i] <=57)) {
    			if(((charArray[j]>='a' && charArray[j]<='z'))  || (charArray[j] >=48 && charArray[j] <=57)) {
    				if(charArray[i] == charArray[j]) {
    					i++;
        				j--;
    				}else {
    					return false;
    				}
    			}else {
    				j--;
    			}
    		}else {
    			i++;
    		}
    	}
    	
    	
    	
    	
    	
		return true;
        
    }
}