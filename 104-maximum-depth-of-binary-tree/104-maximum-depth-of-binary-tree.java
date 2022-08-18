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
    public int maxDepth(TreeNode root) {
        
        if (root == null) return 0;
        
        int maxLeft =1;
        int maxRight = 1;
        
        if (root.left != null) {
            maxLeft = maxDepth(root.left) + 1;
        }
        
        if (root.right != null) {
            maxRight = maxDepth(root.right) + 1;
        }
        
        return Math.max(maxLeft, maxRight);
        
    }
}