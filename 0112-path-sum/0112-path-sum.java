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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }

        Queue<TempTree> queue = new LinkedList<>();
        queue.add(new TempTree(root,root.val));

        while(!queue.isEmpty()){

            TempTree removedNode  = queue.remove();

            if( removedNode.sum  == targetSum && removedNode.node.left ==  null && removedNode.node.right == null){
                    return true;
            }

            TreeNode leftNode = removedNode.node.left;
            TreeNode rightNode = removedNode.node.right;


            if(rightNode!=null){
                int rightSum = rightNode.val+removedNode.sum;
                queue.add(new TempTree(rightNode,rightSum));
            }

            if(leftNode!=null){
                int leftSum = leftNode.val+removedNode.sum;
                queue.add(new TempTree(leftNode,leftSum));
            }

            
        }

        return false;
        
    }

    class TempTree{
        TreeNode node;
        int sum;

        public TempTree(TreeNode node,int sum){
            this.node = node;
            this.sum = sum;
            //print();
        }

        private void print(){
            System.out.println(">node val>>"+node.val+">>Sum>>"+sum);
        }
    }

}