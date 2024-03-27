class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        int i=0,j=0;
        int result = nums[0];
        if(result>=target){
            return 1;
        }

        while(j < nums.length){
            if(result<target){
                j++;
                if(j < nums.length)
                    result=result+nums[j];
            }else{
                result=result-nums[i];
                i++;
            }

            if(result >= target){
               min =  Math.min( ((j-i)+1), min );
            } 
        }
        return min == Integer.MAX_VALUE?0:min;
        
    }
}