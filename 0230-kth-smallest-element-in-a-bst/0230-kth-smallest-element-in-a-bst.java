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

    public int kthSmallest(TreeNode root, int k) {

        Queue<Integer> queue = new LinkedList<>();
        count = k;
        inOrder(root, queue);

        int min = Integer.MAX_VALUE;
        while (!queue.isEmpty() && k > 0) {
            min = queue.poll();
            k--;
        }

        return min;

    }

    private void inOrder(TreeNode root, Queue<Integer> queue) {

        if (root == null) {
            return;
        }

        if (count > 0) {
            inOrder(root.left, queue);
            queue.offer(root.val);
            count--;
            inOrder(root.right, queue);
        } else {
            return;
        }
    }
}