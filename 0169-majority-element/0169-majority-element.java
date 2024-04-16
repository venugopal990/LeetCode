class Solution {
    public int majorityElement(int[] nums) {

        int majority = nums[0];
        int vote = 1;

        for(int i=0;i<nums.length;i++){

                if(nums[i] == majority){
                    vote++;
                }else{
                    vote--;
                }

                if(vote == 0){
                    majority = nums[i];
                    vote = 1;
                }
        }


        return majority;
        
    }
}