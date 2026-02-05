class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        // List to store traversal result
        List<Integer> result = new ArrayList<>();
        
        // Start traversal
        postorder(root, result);
        
        // Return result
        return result;
    }

    // Helper function for postorder traversal
    private void postorder(TreeNode node, List<Integer> result) {
        
        // Stop if node is null
        if (node == null)
            return;

        // Step 1: Traverse left subtree
        postorder(node.left, result);

        // Step 2: Traverse right subtree
        postorder(node.right, result);

        // Step 3: Visit root node
        result.add(node.val);
    }
}
