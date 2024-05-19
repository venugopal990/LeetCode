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

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minValue , long maxValue){

        if(root == null){
            return true;
        }
        if(root.val <= minValue || root.val >= maxValue){
            return false;
        }

        return isValidBST(root.left,minValue,root.val) && isValidBST(root.right,root.val,maxValue); 

    }
/*
    public boolean isValidBST(TreeNode root) {

        List<Integer> inOrderList =  new ArrayList<>();

        inOrder(root,inOrderList);

        //int prev = inOrderList.get(0);

        for(int i=0;i<inOrderList.size()-1;i++){
            if(inOrderList.get(i+1)<=inOrderList.get(i)){
                return false;
            }
        }

        return true;
        
    }


    private void inOrder(TreeNode root, List<Integer> inOrderList){
        if(root == null){
            return;
        }

        inOrder(root.left,inOrderList);
        inOrderList.add(root.val);
        inOrder(root.right,inOrderList);

    }

    */

}