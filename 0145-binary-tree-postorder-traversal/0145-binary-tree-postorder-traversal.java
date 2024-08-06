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

    /** Recursive */
    /*
    public List<Integer> postorderTraversal(TreeNode root) {

        
        List<Integer> resultList =  new ArrayList<>();

        if(root == null){
            return resultList;
        }

        postOrderRecursive(root,resultList);

        return resultList;

    }


    private void postOrderRecursive(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        postOrderRecursive(root.left,list);
        postOrderRecursive(root.right,list);
        list.add(root.val);
        
    }
*/

    /** Iterative - left right root - */
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> resultList =  new ArrayList<>();
        if(root == null){
            return resultList;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while(!stack1.isEmpty()){
            TreeNode  removedNode = stack1.pop();
            stack2.push(removedNode);
            if(removedNode.left!=null){
                stack1.push(removedNode.left);
            }

            if(removedNode.right!=null){
                stack1.push(removedNode.right);
            }
        }


        while(!stack2.isEmpty()){
            resultList.add(stack2.pop().val);
        }


        return resultList;
    }

   
}