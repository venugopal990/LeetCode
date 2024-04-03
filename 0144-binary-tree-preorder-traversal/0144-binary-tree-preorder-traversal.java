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
        if(root == null){
            return resultList;
        }
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        treeNodeStack.push(root);
        while(!treeNodeStack.isEmpty()){

            TreeNode current = treeNodeStack.pop();
            resultList.add(current.val);
             if(current.right!=null){
                treeNodeStack.push(current.right);
            }

            if(current.left!=null){
                treeNodeStack.push(current.left);
            }
        }
        return resultList;
    }


    
}