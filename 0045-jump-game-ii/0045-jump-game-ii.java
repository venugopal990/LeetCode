class Solution {
    public int jump(int[] nums) {

        if(nums.length == 1){
            return 0;
        }
    
		 int steps=0;
		 int farthest = 0;
		 int end =0;
		 
		 for (int i = 0; i < nums.length; i++) {
			 
			 farthest = Math.max(farthest, i+nums[i]);
			 
			 if(farthest >= nums.length-1) {
				 ++steps;
				 break;
			 }
			 
			 
			 if(i == end) {
				 ++steps;
				 end = farthest;
			 }
			
		}
		 
		 return steps;
    }
}