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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList =  new ArrayList<>();
        Stack<TreeNode> stack =  new Stack<>();
        TreeNode node = root; 
        while(true){
            
            if(node!=null){
                stack.push(node);
                node =  node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }else{
                    TreeNode popNode = stack.pop();
                    resultList.add(popNode.val);
                    node = popNode.right;
                }
            }
        }
        return resultList;
    }

    
    /*
    private void inOrder(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }

        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }*/
}