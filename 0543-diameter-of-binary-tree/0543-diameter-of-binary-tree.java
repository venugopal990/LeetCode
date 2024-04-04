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

 class TreeInfo{
    int ht;
    int dia;
    public TreeInfo(int ht,int dia){
        this.ht=ht;
        this.dia=dia;
    }
 }
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }

    private TreeInfo diameter(TreeNode root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht+right.ht;

        int mydia = Math.max(Math.max(dia1,dia2),dia3);
 
        return new TreeInfo(myHeight,mydia);
    }
}