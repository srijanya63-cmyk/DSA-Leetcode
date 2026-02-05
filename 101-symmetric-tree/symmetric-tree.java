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

    // Function to check if tree is symmetric
    public boolean isSymmetric(TreeNode root) {
        // If tree is empty, it is symmetric
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    // Helper function to compare two subtrees
    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {

        // If either side is null, both must be null to be symmetric
        if (left == null || right == null)
            return left == right;

        // Values must be equal
        if (left.val != right.val)
            return false;

        // Check mirror condition:
        // left child of left subtree with right child of right subtree
        // and vice versa
        return isSymmetricHelp(left.left, right.right) &&
               isSymmetricHelp(left.right, right.left);
    }
}
