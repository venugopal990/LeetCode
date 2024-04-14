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
    public int widthOfBinaryTree(TreeNode root) {

        Queue<TempTree> queue = new LinkedList<>();
        queue.offer(new TempTree(root,0));
        queue.offer(new TempTree(null,0));
        int maxWidth = 0;
        int i=0,j=0;
        boolean flag = false;


        while(!queue.isEmpty()){
            TempTree removedNode = queue.remove();

            if(flag){
                i = removedNode.index;
                flag =  false;
            }

            if(!queue.isEmpty() && queue.peek().node == null){
                j = removedNode.index;
                maxWidth = Math.max((j-i)+1,maxWidth);
            }

            if(removedNode.node == null){
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.offer(new TempTree(null,0));
                    flag = true;
                }

            }else{
                if(removedNode.node.left != null){
                     queue.offer(new TempTree(removedNode.node.left,(2*removedNode.index)+1));
                }

                if(removedNode.node.right != null){
                     queue.offer(new TempTree(removedNode.node.right,(2*removedNode.index)+2));
                }
            }
        }



        return maxWidth;

    }

    public class TempTree{
        TreeNode node;
        int index;
        

        public TempTree(TreeNode node,int index){
            this.node =  node;
            this.index =  index;
        }
        
    }
}