class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j = (long)Math.sqrt(c);
        while(i<=j){
            long ans = i*i+j*j;
            if(ans>c){
                j--;
            }else if(ans<c){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}