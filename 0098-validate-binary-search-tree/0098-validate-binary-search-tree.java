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

        List<Integer> inOrderList =  new ArrayList<>();

        inOrder(root,inOrderList);

        int prev = inOrderList.get(0);

        for(int i=1;i<inOrderList.size();i++){
            if(inOrderList.get(i)>prev){
                prev = inOrderList.get(i);
            }else{
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

}