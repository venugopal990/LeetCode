class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       Integer max =  Arrays.stream(candies).max().getAsInt();

       List<Boolean> result =  new ArrayList<>();
       for(int i : candies){
            result.add((i+extraCandies) >= max);
       }
       return result;
    }
}