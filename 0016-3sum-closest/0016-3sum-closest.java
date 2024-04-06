class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int closestSum = nums[0] + nums[1] + nums[2];
        int minValue = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum =nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return target;
                }
                if(sum>target){
                    k--;
                }else{
                    j++;
                }


                if(Math.abs(target - sum) < minValue){
                    closestSum = sum;
                    minValue = Math.abs(target - sum);
                }
            }
        }
        return closestSum;
        
    }
}