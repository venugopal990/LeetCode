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

    /*
    //resursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        preOrder(root, resultList);
        return resultList;
    }


    private void preOrder(TreeNode root, List<Integer> resultList){
        if(root == null){
            return;
        }
        resultList.add(root.val);
        preOrder(root.left,resultList);
        preOrder(root.right,resultList);
    }
    */


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if(root == null){
            return resultList;
        }
        Stack<TreeNode> stack =  new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode removedElement = stack.pop();
            resultList.add(removedElement.val);

            if(removedElement.right!=null){
                stack.push(removedElement.right);
            }

            if(removedElement.left!=null){
                stack.push(removedElement.left);
            }
        }


        return resultList;
    }
}