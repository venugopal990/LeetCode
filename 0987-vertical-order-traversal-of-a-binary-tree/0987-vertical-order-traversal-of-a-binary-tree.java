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
 class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode node,int row,int col){
        this.node = node;
        this.row = row;
        this.col = col;

    }
 }
class Solution {
 
    public List<List<Integer>> verticalTraversal(TreeNode root) {


        List<List<Integer>> result =  new ArrayList<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root,0,0));
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new  TreeMap<>();

        while(!queue.isEmpty()){

            Tuple tuple = queue.remove();
            int x = tuple.row;
            int y = tuple.col;

            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }

            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).add(tuple.node.val);


            if(tuple.node.left!=null){
                queue.offer(new Tuple(tuple.node.left,x-1,y+1));
            }

            if(tuple.node.right!=null){
                queue.offer(new Tuple(tuple.node.right,x+1,y+1));
            }

        }
        List<List<Integer>> resList = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> entry : map.values()){

        List<Integer> tempList = new ArrayList<>();

        for(PriorityQueue<Integer> priorityQueue : entry.values()){
                while(!priorityQueue.isEmpty()){
                    tempList.add(priorityQueue.remove());
                }
            }
            resList.add(tempList);
        }

         return resList;


        
    }
}