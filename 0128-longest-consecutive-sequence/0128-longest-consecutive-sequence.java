class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
       int maximum_consecutive = Integer.MIN_VALUE;
       Set<Integer> logestSet = new TreeSet<>();
        for(int i:nums){
            logestSet.add(i);
        }

        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int j:logestSet){

            if(min == Integer.MAX_VALUE){
                min = j;
                count++;
                maximum_consecutive  = Math.max(count, maximum_consecutive);
            }

            if(j  == min+1){
                min = j;
                count++;
                maximum_consecutive  = Math.max(count, maximum_consecutive);
            }else{
                min = j;
                count = 1;
            }
        }
        return maximum_consecutive;
        
    }
}