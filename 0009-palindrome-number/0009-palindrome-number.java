class Solution {
    public boolean isPalindrome(int x) {
        int tempNumber = x; 
        int result=0;
        
        while(x>0) {
        	int rem  = x%10;
        	result = (result*10)+rem;
        	x = x/10;
        }
        
        
        return result == tempNumber;
    }
}