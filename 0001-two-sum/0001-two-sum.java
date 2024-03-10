class Solution {

    
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentValue =nums[i];
            int x=target - currentValue;
             if (map.containsKey(x)) {
                return new int[]{map.get(x),i};
              }
            map.put(currentValue, i);
        }
        return new int[]{};

        
    }



    
}