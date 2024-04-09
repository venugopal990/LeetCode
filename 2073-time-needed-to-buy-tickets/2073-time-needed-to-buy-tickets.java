class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int seconds = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<tickets.length;i++){
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            int element = queue.remove();
            tickets[element]--;
            seconds++;

            if(tickets[k] == 0 && element == k){
                return seconds;
            }

            if(tickets[element] > 0){
                 queue.offer(element);
            }
        }
       return seconds; 
    }

}
