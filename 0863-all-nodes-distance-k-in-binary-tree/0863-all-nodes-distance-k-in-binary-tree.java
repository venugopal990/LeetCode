/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parentMap =  new HashMap<>();
        getParents(root, parentMap);
        Set<TreeNode> visitedNodes =  new HashSet<>();
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(target);
        visitedNodes.add(target);

        while(!queue.isEmpty()){
            int size = queue.size();
            if(k == 0) break;

            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();

                if(curr.left!=null && !visitedNodes.contains(curr.left)){
                    queue.offer(curr.left);
                    visitedNodes.add(curr.left);
                }

                if(curr.right!=null && !visitedNodes.contains(curr.right)){
                    queue.offer(curr.right);
                    visitedNodes.add(curr.right);
                }

                if(parentMap.get(curr)!=null && !visitedNodes.contains(parentMap.get(curr))){
                    queue.offer(parentMap.get(curr));
                    visitedNodes.add(parentMap.get(curr));
                }
            }
            k--;
        }

        List<Integer> result =  new ArrayList<>();
        while(!queue.isEmpty()){
            result.add(queue.poll().val);
        }

        return result;
    }

    private void getParents(TreeNode root, Map<TreeNode,TreeNode> parentMap){
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);
    
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();

            if(curr.left!=null){
                queue.offer(curr.left);
                parentMap.put(curr.left,curr);
            }

            if(curr.right!=null){
                queue.offer(curr.right);
                parentMap.put(curr.right,curr);
            }
        }
    }
}