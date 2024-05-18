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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root ==  null){
            return result;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for(int i=0;i<size;i++){
                TreeNode currNode = queue.remove();
                sum+=currNode.val;
                if(currNode.left!=null){
                    queue.offer(currNode.left);
                }
                
                if(currNode.right!=null){
                    queue.offer(currNode.right);
                }
            }
            double avg = sum/size;
            result.add(avg);
        }

        return result;
    }
}