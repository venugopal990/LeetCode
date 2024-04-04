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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> resultList =  new ArrayList<>();
        if(root == null){
            return resultList;
        }
        Stack<TreeNode> stack1 =  new Stack<>();
        Stack<TreeNode> stack2 =  new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode currentNode = stack1.pop();
            stack2.push(currentNode);

            if(currentNode.left!=null){
                stack1.push(currentNode.left);
            }

            if(currentNode.right!=null){
                stack1.push(currentNode.right);
            }

        }

        while(!stack2.isEmpty()){
            resultList.add(stack2.pop().val);
        }
        return resultList;
    }

    /*
    private void postOrder(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }

        postOrder(root.left,arr);
        postOrder(root.right,arr);
        arr.add(root.val);
    }*/
}