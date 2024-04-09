class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue =  new LinkedList<>();
        int sandwichIndex = 0;
        int [] loopTrackArray = new int[students.length];
        Arrays.fill(loopTrackArray, 0);

        for(int i=0;i<students.length;i++){
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            if(loopTrackArray[queue.peek()]==1){
                break;
            }
            int elementIndex  = queue.remove();
            if(students[elementIndex] == sandwiches[sandwichIndex]){
                sandwichIndex++;
                Arrays.fill(loopTrackArray, 0);
            }else{
                queue.offer(elementIndex);
                loopTrackArray[elementIndex]=1;
                
            }
        }

        return queue.size();
        
    }
}