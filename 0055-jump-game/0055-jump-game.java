class Solution {
    public boolean canJump(int[] nums) {

        int finalIndex = nums.length-1;
		
		for (int i = nums.length-2; i >=0; i--) {
			
			if((nums[i]+i) >= finalIndex) {
				finalIndex = i;
			}
			
		}	
		return finalIndex == 0;
        
    }
}