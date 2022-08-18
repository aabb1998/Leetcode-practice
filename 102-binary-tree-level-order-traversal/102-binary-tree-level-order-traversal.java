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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        
        if (root == null) return levels;
        
        int level = 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (!queue.isEmpty()) {
            
            levels.add(new ArrayList<Integer>());
            
            int levelLength = queue.size();
            
            for (int i =0 ; i < levelLength; i++) {
                
                TreeNode node = queue.poll();
                
                levels.get(level).add(node.val);
                
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                
            }
            
            level++;
            
        }
        return levels;
    }
}