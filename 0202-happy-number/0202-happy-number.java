class Solution {

//Floyd's cycle detection algorithm
public boolean isHappy(int n) {
    int slow =  n;
    int fast = n;


    do{
        slow =  calculateSum(slow);
        fast =  calculateSum(calculateSum(fast));
    }  while(slow!=fast);


    return slow == 1;



} 


    private int calculateSum(int num){
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            num = num/10; 
            sum+= rem*rem;
        }
        return sum;
    }



    
    /*public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int sum = calculateSum(n);
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }*/
}