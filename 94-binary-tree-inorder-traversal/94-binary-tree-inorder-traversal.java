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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();
        
        while (true) {
            
            if (root != null) {
                stack.push(root);
                root = root.left;
                
                
            } else {
                if (stack.isEmpty()) break;
                TreeNode node = stack.pop();
                list.add(node.val);
                root = node.right;
            }
            
            
        }
        
        return list;
        
    }
}