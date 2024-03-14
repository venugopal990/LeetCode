class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        char[] sCharArray =  s.toCharArray();
		char[] tCharArray = t.toCharArray();
		int cursor = 0;
		boolean result = false;
		for (int i = 0; i < sCharArray.length; i++) {

			for (int j = cursor; j < tCharArray.length; j++) {

				if(sCharArray[i] == tCharArray[j]) {
					j++;
					cursor = j;
					result = true;
					break;
				}else {
					result = false;
				}
			}

			if(i != sCharArray.length-1) {
				if(!result) {
					return false;
				}else {
					result = false;
				}
			}

		}
		return result;
    }
}