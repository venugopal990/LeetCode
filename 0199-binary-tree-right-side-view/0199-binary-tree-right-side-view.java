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
        public Tuple(TreeNode node, int x){
            this.node =  node;
            this.x =x;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root,0));
        while(!queue.isEmpty()){
            Tuple removedNode = queue.poll();
            int x = removedNode.x;

            map.put(x,removedNode.node.val);

            if(removedNode.node.left!=null){
                queue.offer(new Tuple(removedNode.node.left,x+1));
            }

            if(removedNode.node.right!=null){
                queue.offer(new Tuple(removedNode.node.right,x+1));
            }
        }

        for(Integer val : map.values()){
            result.add(val);
        }
        return result;
    }
}