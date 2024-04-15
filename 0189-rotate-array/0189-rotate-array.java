class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        nums = rotateArray(nums,0,nums.length-1);
        nums = rotateArray(nums,0,k-1);
        nums = rotateArray(nums,k,nums.length-1);
        
    }


    private int[] rotateArray(int [] nums ,int i,int j){

        while(i<j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }

        return nums;
    }
}