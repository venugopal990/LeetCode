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
    public boolean isSymmetric(TreeNode root) {


        root.right= invertTree(root.right);

        return isSameTree(root.left,root.right);
        
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {


        if(p!=null && q!=null &&  p.val != q.val){
            return false;
        }else if(p!=null && q!=null &&  p.val == q.val){
            if(isSameTree(p.left, q.left) &&  isSameTree(p.right, q.right)){
                return true;
            }else{
                return false;
            }
        }else if(p!=null && q==null){
            return false;
        }else if(q!=null && p==null){
            return false;
        }
        
       return true;

    }



     public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
 
    }
}