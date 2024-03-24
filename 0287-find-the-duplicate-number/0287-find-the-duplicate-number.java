class Solution {
    public int findDuplicate(int[] nums) {
        //Floyd's Cycle
        int slow=0, fast=0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);


        slow = 0;

        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }



        return fast;
    }
}