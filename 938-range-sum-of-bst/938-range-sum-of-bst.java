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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> values = new Stack<>();
        stack.push(root);
        
        int count = 0;
        
        while (!stack.isEmpty()) {
            
            TreeNode current = stack.pop();
            if (current.val >= low && current.val <= high) {
                count += current.val;
            }
            
            if (current.left != null) stack.push(current.left);
            if (current.right != null) stack.push(current.right);
            
            
        }
        
        
        return count;
        
    }
}