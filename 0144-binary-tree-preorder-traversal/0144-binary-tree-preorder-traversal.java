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

    /* Recursive */
    /*
    private void preOrderRecursive(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrderRecursive(root.left,list);
        preOrderRecursive(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        preOrderRecursive(root,resultList);
        return resultList;
    }
    */

    /* Iterative */
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> resultList = new ArrayList<>();
        if(root == null){
            return resultList;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode removedNode  = stack.pop();
            resultList.add(removedNode.val);

            if(removedNode.right!=null){
                stack.push(removedNode.right);
            }

            if(removedNode.left!=null){
                stack.push(removedNode.left);
            }
        }
        return resultList;
    }


    
}