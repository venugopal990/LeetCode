/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String result = "";
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        result+=String.valueOf(root.val)+",";
        while(!queue.isEmpty()){
            TreeNode removedNode =  queue.remove();
            
            if(removedNode.left!=null){
                queue.offer(removedNode.left);
                result+=String.valueOf(removedNode.left.val)+",";
            }else{
               result+="#"+","; 
            }

            if(removedNode.right!=null){
                queue.offer(removedNode.right);
                result+=String.valueOf(removedNode.right.val)+",";
            }else{
                result+="#"+","; 
            }
        }
        result = result.substring(0,result.length()-1);
        return result;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        System.out.println(data);
        if(data.equals("")){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        String[] dataArr = data.split(",");
        TreeNode root = new TreeNode(Integer.valueOf(dataArr[0]));
        queue.offer(root);
        for(int i=1;i<dataArr.length;i++){
            TreeNode parent = queue.remove();

            if(!dataArr[i].equals("#")){
                TreeNode left = new TreeNode(Integer.parseInt(dataArr[i]));
                parent.left = left;
                queue.offer(left);
            }

            if(!dataArr[++i].equals("#")){
                TreeNode right = new TreeNode(Integer.parseInt(dataArr[i]));
                parent.right = right;
                queue.offer(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));