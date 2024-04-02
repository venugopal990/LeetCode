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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        preOrder(root,resultList);

        return resultList;
    }


    private void preOrder(TreeNode root,List<Integer> arrList){
        if(root == null){
            return;
        }
        arrList.add(root.val);
        preOrder(root.left,arrList);
        preOrder(root.right,arrList);
    }
}