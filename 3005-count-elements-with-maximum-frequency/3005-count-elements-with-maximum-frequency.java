class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxValue = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            if (countMap.get(nums[i]) != null) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);

            } else {
                countMap.put(nums[i], 1);
            }

            
            if (countMap.get(nums[i]) > maxValue) {
                maxValue = countMap.get(nums[i]);
                result = maxValue;
            } else if (maxValue == countMap.get(nums[i])) {
                result += countMap.get(nums[i]);
            }
        }

        return result;
    }
}