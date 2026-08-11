// Last updated: 11/08/2026, 16:15:25

class Solution {
    List<Integer> l = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return l;
    }
        void inOrder(TreeNode root) {
		if(root==null)
			return;
		inOrder(root.left);
        l.add(root.val);
		System.out.println(root.val);
		inOrder(root.right);
    }
}