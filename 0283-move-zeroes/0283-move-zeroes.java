class Solution {
    public void moveZeroes(int[] nums) {
        int count =-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count++;
                nums[count]=nums[i];
            }
        }

        for(int j=count+1;j<nums.length;j++){
            nums[j]=0;
        }
        
    }
}