class Solution {
    public int maxArea(int[] height) {

        int i=0;
        int j=height.length-1;
        int maxWater =  Integer.MIN_VALUE;

        while(i<j){

            int waterCount = (j-i)*Math.min(height[i],height[j]);
            maxWater =  Math.max(waterCount,maxWater);

            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }

        return maxWater;
        
    }
}