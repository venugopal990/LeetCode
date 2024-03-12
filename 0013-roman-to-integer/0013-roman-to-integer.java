class Solution {
    public int romanToInt(String s) {
        
		char[] romanInput = s.toCharArray();
		int result = 0;
		int previousValue = 0;
		
		for (int i = romanInput.length-1; i>=0; i--) {
			
			int currentValue = getValue(romanInput[i]);

			
			if(currentValue < previousValue) {
				result-=currentValue;
			}else {
				result+=currentValue;
			}
			
			previousValue = currentValue;
		}
		
		return result;
    }


    public int getValue(char ch) {
		int result = 0;
		switch (ch) {
			case 'I':
				result=1;
				break;
			case 'V':
				result=5;
				break;
			case 'X':
				result=10;
				break;
			case 'L':
				result=50;
				break;
			case 'C':
				result=100;
				break;
			case 'D':
				result=500;
				break;
			case 'M':
				result=1000;
				break;
			default:
				break;
		}
		return result;
		
	}
}