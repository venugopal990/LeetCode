class Solution {
    public int search(int[] nums, int target) {


        int low = 0;
        int high = nums.length-1;

       return binarySearch(nums,low,high,target);
        
    }

    private int binarySearch(int arr[], int low, int high, int target){

        if(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                return binarySearch(arr,low,mid-1,target);
            }else{
                return binarySearch(arr,mid+1,high,target);
            }
        }
        return -1;
    }
}