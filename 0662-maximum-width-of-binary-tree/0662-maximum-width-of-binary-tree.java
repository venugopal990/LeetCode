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

        int maxWidth = Integer.MIN_VALUE;
        Queue<TempNode> queue = new LinkedList<>();
        queue.offer(new TempNode(root,0));

        while(!queue.isEmpty()){

            int firstIndex = 0;
            int lastIndex = 0;
            int size = queue.size();

            for(int i=0;i<size;i++){
                TempNode removedNode = queue.poll();
                if(i == 0){
                    firstIndex = removedNode.index;
                }

                if(i == size-1){
                    lastIndex = removedNode.index;
                }

                if(removedNode.node.left!=null){
                    queue.offer(new TempNode(removedNode.node.left,(2*removedNode.index)+1));
                }

                if(removedNode.node.right!=null){
                    queue.offer(new TempNode(removedNode.node.right,(2*removedNode.index)+2));
                }
            }

            maxWidth  = Math.max((lastIndex-firstIndex)+1,maxWidth);
            
             firstIndex = 0;
             lastIndex = 0;


        }

        return maxWidth;

    }
    /*
    public int widthOfBinaryTree(TreeNode root) {

        int maxWidth = Integer.MIN_VALUE;

        Queue<TempNode> queue = new LinkedList<>();
        queue.offer(new TempNode(root,0));
        queue.offer(new TempNode(null,0));
        int i=0;
        int j=0;
        TreeNode prevNode = root;
        while(!queue.isEmpty()){
            
            TempNode removedNode = queue.poll();

            if(removedNode.node == null){
                maxWidth = Math.max((j-i)+1 , maxWidth);
                i = 0;
                j = 0;
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.offer(new TempNode(null,0));
                }
            }else{
                if(removedNode.node.left!=null){
                    queue.offer(new TempNode(removedNode.node.left,(2*removedNode.index)+1));
                }

                if(removedNode.node.right!=null){
                    queue.offer(new TempNode(removedNode.node.right,(2*removedNode.index)+2));
                }
            }

            if(queue.peek().node == null){
                 j = removedNode.index;
            }

            if(prevNode == null){
                i = removedNode.index;
            }

            prevNode = removedNode.node;

        }

        return maxWidth;
    }*/

    public class TempNode{
        TreeNode node;
        int index;

        public TempNode(TreeNode node,int index){
            this.node =  node;
            this.index = index;
        } 
    }
}