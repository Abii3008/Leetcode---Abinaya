// Last updated: 11/08/2026, 16:01:27
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
    private int dominantCount=0;
    public int countDominantNodes(TreeNode root) {
        dominantCount =0;
        checkDominant(root);
        return dominantCount;
    }
    private int checkDominant(TreeNode node) {
        if(node==null) {
            return Integer.MIN_VALUE;
        }
        int leftMax=checkDominant(node.left);
        int rightMax=checkDominant(node.right);
        int subtreeMax=Math.max(leftMax,rightMax);
        if(node.val >= subtreeMax) {
            dominantCount++;
        }
        return Math.max(node.val,subtreeMax);
    }
}