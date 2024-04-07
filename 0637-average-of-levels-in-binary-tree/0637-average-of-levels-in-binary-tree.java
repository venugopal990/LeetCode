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
        int count = 0;
        double sum = 0;
        
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()){
            TreeNode currNode = queue.remove();
            if(currNode == null){
                double avg = sum/count;
                result.add(avg);
                sum=0;
                count=0;

                if(queue.isEmpty()){
                    break;
                }else{queue.offer(null);}

            }else{
                count++;
                sum+=currNode.val;                
                if(currNode.left!=null){
                    queue.offer(currNode.left);
                }
                
                if(currNode.right!=null){
                    queue.offer(currNode.right);
                }
            }
        }


        return result;
    }
}