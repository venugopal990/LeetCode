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
    int count = 0;
    int result = Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return result;
    }


    private void inOrder(TreeNode root, int k){
        if(root == null){
            return;
        }

        kthSmallest(root.left, k);

        count++;
        if(k == count){
            result = root.val; 
            return;
        }
        kthSmallest(root.right, k);
       

    }
}