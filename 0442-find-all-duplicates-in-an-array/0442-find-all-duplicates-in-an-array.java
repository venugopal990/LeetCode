class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        Set<Integer> hashSet =  new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                resultList.add(nums[i]);
            }else{
                hashSet.add(nums[i]);
            }
        }

        return resultList;
    }
}