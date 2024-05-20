class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge =  new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=2*n-1; i>=0; i--){
            int element  = nums[i%n];

            while(!stack.isEmpty() && stack.peek() <= element){
                stack.pop();
            }
            
            if(i<n){
                nge[i] = stack.isEmpty()?-1:stack.peek();
            }

            stack.push(element);
        }

        return nge;
    }
}