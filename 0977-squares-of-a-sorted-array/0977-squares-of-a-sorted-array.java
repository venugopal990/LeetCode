class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        int[] result = new int[nums.length];
        int first = 0;
        int last = nums.length-1;
        int i= nums.length-1;
        while(first<=last){

            if(nums[last]>nums[first]){
                result[i]=nums[last];
                last--;
            }else{
                result[i]=nums[first];
                first++;
            }
            i--;
        }


        return result;

    }
}