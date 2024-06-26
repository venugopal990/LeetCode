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
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root,false);
    }
    private int dfs(TreeNode root,boolean isLeft){

        if(root ==  null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return isLeft?root.val:0;
        }

        int left = dfs(root.left,true);
        int right = dfs(root.right,false);

        return left+right;

    }
    /*
    public int sumOfLeftLeaves(TreeNode root) {

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,false));
        int sum=0;
        while(!queue.isEmpty()){

           Pair removedPair =  queue.poll();

           if(removedPair.isLeft && removedPair.node.left == null && removedPair.node.right == null){
             sum+=removedPair.node.val;
           }

           if(removedPair.node.left!=null){
             queue.offer(new Pair(removedPair.node.left,true));
           }

           if(removedPair.node.right!=null){
             queue.offer(new Pair(removedPair.node.right,false));
           }
        }
        return sum;
    }

    class Pair{
        TreeNode node;
        boolean isLeft;
        public Pair(TreeNode node,boolean isLeft){
            this.node= node;
            this.isLeft=isLeft;
        }
    }*/
}