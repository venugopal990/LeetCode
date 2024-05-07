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
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);
        int maxValue  = root.val;
        int maxValueLevel = 1;
        int currentLevel = 0;
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            int tempSum = 0;
            currentLevel++;
            for(int i=0;i<queueSize;i++){
                TreeNode removedElement = queue.remove();
                tempSum+=removedElement.val;

                if(removedElement.left!=null){
                    queue.offer(removedElement.left);
                }

                if(removedElement.right!=null){
                    queue.offer(removedElement.right);
                }
            }

            if(tempSum>maxValue){
                maxValue = tempSum;
                maxValueLevel = currentLevel;
            }
        }
        return maxValueLevel;   
    }
}