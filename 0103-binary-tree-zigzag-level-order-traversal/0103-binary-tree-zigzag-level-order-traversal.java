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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> resultList =  new ArrayList<>();
        if(root == null){
            return resultList;
        }

        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);
        boolean isZigzag = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tempList =  new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<size;i++){
                TreeNode removedNode = queue.remove();
                if(isZigzag){
                    stack.push(removedNode.val);
                }else{
                    tempList.add(removedNode.val);
                }

                if(removedNode.left!=null){
                    queue.offer(removedNode.left);
                }

                 if(removedNode.right!=null){
                    queue.offer(removedNode.right);
                }
            }

            while(!stack.isEmpty()){
                tempList.add(stack.pop());
            }
            resultList.add(tempList);
            isZigzag = !isZigzag;
        }
        return resultList;
    }
}