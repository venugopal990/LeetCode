class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> countMap =  new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int result = target-nums[i];
            if(countMap.get(result)!=null){
                return new int[]{countMap.get(result),i};
            }else{
                countMap.put(nums[i],i);
            }
        }
       return new int[]{}; 
    }
}