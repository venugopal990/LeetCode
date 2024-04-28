/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    int count = 0;
    int min  = 0;

    public int kthSmallest(TreeNode root, int k) {

        count = k;
        inOrder(root);
        return min;

    }

    private void inOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        if (count > 0) {
            min = root.val;
            count--;
        } else {
            return;
        }
        inOrder(root.right);

    }
}