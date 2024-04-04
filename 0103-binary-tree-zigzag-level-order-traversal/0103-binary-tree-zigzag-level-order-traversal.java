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
        boolean isZigZagFlag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();
            Stack<Integer> stack  = new Stack();
            
            for(int i=0;i<size;i++){
                TreeNode  curr = queue.remove();

                if(isZigZagFlag){
                    stack.push(curr.val);
                }else{
                    tempList.add(curr.val);
                }

                if(curr.left!=null){
                    queue.add(curr.left);
                }

                if(curr.right!=null){
                    queue.add(curr.right);
                }   
            }

            isZigZagFlag = !isZigZagFlag;

            while(!stack.isEmpty()){
                tempList.add(stack.pop());
            }
            resultList.add(tempList);
        }
        return resultList;
    }
}