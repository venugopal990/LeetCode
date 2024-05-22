class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){

            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                }
                
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // Both asteroids destroy each other
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // Negative asteroid survives
                }
            }

        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }


        return result;
    }
}