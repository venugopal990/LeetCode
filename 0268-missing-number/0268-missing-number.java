class Solution {
    public int missingNumber(int[] nums) {

        int[] newArray = new int[nums.length];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=0;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length)
                newArray[nums[i]]=1;
        }

        for(int i=0;i<newArray.length;i++){
           if(newArray[i]==0){
                return i;
           }
        }


        return nums.length;
    }
}