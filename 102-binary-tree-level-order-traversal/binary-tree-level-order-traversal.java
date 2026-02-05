class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        // Result list
        List<List<Integer>> result = new ArrayList<>();
        
        // If tree empty, return empty result
        if (root == null)
            return result;

        // Queue for BFS traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // Process until queue is empty
        while (!queue.isEmpty()) {
            
            int size = queue.size(); // number of nodes in this level
            List<Integer> level = new ArrayList<>();

            // Traverse one level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // Add value to level list
                level.add(node.val);

                // Add left child if exists
                if (node.left != null)
                    queue.offer(node.left);

                // Add right child if exists
                if (node.right != null)
                    queue.offer(node.right);
            }

            // Add level result
            result.add(level);
        }

        return result;
    }
}
