class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length){
            return false;
        }

        int[] countArr = new int[1001];

        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;
            countArr[target[i]]--;
        }


        for(int countValue : countArr){
            if(countValue!=0){
                return false;
            }
        }

        return true;
    }
}