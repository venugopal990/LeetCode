/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    class Tuple{
        TreeNode node;
        int x;
        int y;
        public Tuple(TreeNode node, int x, int y){
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> result =  new TreeMap<>();
        Queue<Tuple> queue =  new LinkedList<>();
        queue.offer(new Tuple(root,0,0));

        while(!queue.isEmpty()){

            Tuple removedTuple = queue.poll();
            int x = removedTuple.x;
            int y = removedTuple.y;

            if(!result.containsKey(x)){
                result.put(x,new TreeMap<>());
            }

            if(!result.get(x).containsKey(y)){
                result.get(x).put(y,new PriorityQueue<>());
            }

            result.get(x).get(y).add(removedTuple.node.val);

            if(removedTuple.node.left!=null){
                queue.offer(new Tuple(removedTuple.node.left,x-1,y+1));
            }

            if(removedTuple.node.right!=null){
                queue.offer(new Tuple(removedTuple.node.right,x+1,y+1));
            }
        }

        System.out.println(Arrays.toString(result.entrySet().toArray()));


        List<List<Integer>> resultList = new ArrayList<>();

        for(TreeMap<Integer,PriorityQueue<Integer>> mapValue: result.values()){
            List<Integer> tempList = new ArrayList<>();
            for(PriorityQueue<Integer> queueValue : mapValue.values()){
                while(!queueValue.isEmpty()){
                    tempList.add(queueValue.poll());
                }
            }
            resultList.add(tempList);
        }

        return resultList;
    }
}