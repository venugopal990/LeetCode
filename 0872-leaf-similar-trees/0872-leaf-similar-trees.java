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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> root1List =  new  ArrayList<>();
        List<Integer> root2List =  new  ArrayList<>();


        addLeafs(root1,root1List);
        addLeafs(root2,root2List);

        if(root1List.equals(root2List))
            return true;
        else
            return false;    

    }

    public void  addLeafs(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }

        if(root.left == null && root.right==null){
            list.add(root.val);
        }else{
            addLeafs(root.left,list);
            addLeafs(root.right,list);
        }


    }
}