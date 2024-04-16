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
    public int sumNumbers(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,root.val));
        int sum=0;

        while(!queue.isEmpty()){

            Pair removedPair = queue.remove();

            if(removedPair.node.left==null && removedPair.node.right==null){
                sum+=removedPair.sum;
            }

            if(removedPair.node.left!=null){
                queue.add(new Pair(removedPair.node.left,(removedPair.sum*10)+removedPair.node.left.val));
            }

            if(removedPair.node.right!=null){
                queue.add(new Pair(removedPair.node.right,(removedPair.sum*10)+removedPair.node.right.val));
            }

        }

        return sum;
    }

    class Pair{
        int sum;
        TreeNode node;
        public Pair(TreeNode node,int sum){
            this.node= node;
            this.sum=sum;
        }    
    } 
}