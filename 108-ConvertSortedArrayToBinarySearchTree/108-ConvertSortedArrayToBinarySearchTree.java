// Last updated: 11/08/2026, 16:15:10
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
    public TreeNode getRoot(int[] nums, int l, int r) {
        if (l > r)
            return null;
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getRoot(nums, l, mid - 1);
        root.right = getRoot(nums, mid + 1, r);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return getRoot(nums, 0, nums.length - 1);
    }
}