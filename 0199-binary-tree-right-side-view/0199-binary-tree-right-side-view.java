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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new  ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TNode> queue = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        queue.offer(new TNode(root,0));
        while(!queue.isEmpty()){

            TNode removedNode = queue.poll();
            int x =  removedNode.x;
            map.put(x,removedNode.node.val);
            if(removedNode.node.left!=null){
                queue.offer(new TNode(removedNode.node.left,x+1));
            }

            if(removedNode.node.right!=null){
                queue.offer(new TNode(removedNode.node.right,x+1));
            }

        }
        result.addAll(map.values());
        return result;
        
    }

    class TNode{
        TreeNode node;
        int x;
        public TNode(TreeNode node,int x){
            this.node = node;
            this.x = x;
        }

    }

}

