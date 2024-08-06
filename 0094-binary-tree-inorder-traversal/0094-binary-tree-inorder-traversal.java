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
    /* Iterative - left Root Right - */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();

        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            resultList.add(root.val);
            root = root.right;

        }


        return resultList;
    }


    /** Recursive */
    /*
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList =  new ArrayList<>();
        inOrderRecursive(root,resultList);
        return resultList;
    }

    
   private void inOrderRecursive(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrderRecursive(root.left,list);
        list.add(root.val);
        inOrderRecursive(root.right,list);
   }
   */
}