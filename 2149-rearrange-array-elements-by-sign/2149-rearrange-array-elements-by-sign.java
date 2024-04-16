class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] positive =  new int[nums.length/2];
        int[] negative =  new int[nums.length/2];
        
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                positive[k++]=nums[i];
            }else{
                 negative[j++]=nums[i];
            }
        }

         k=0;
         j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=positive[k++];
            }else{
                nums[i]=negative[j++];
            }
        }

        return nums;
        
    }
}