class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if(countMap.containsKey(nums[i]) && (i - countMap.get(nums[i]) <=k) )
				return true;
			else
				countMap.put(nums[i], i);
			
		}
		return false;
    }
}