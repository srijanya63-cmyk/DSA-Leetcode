class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();
        
        for (int[] d : descriptions) {
            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];

            // Create nodes if not present
            map.putIfAbsent(parent, new TreeNode(parent));
            map.putIfAbsent(child, new TreeNode(child));

            TreeNode parentNode = map.get(parent);
            TreeNode childNode = map.get(child);

            // Attach child
            if (isLeft == 1)
                parentNode.left = childNode;
            else
                parentNode.right = childNode;

            // mark child
            children.add(child);
        }

        // find root
        for (int[] d : descriptions) {
            int parent = d[0];
            if (!children.contains(parent))
                return map.get(parent);
        }

        return null;
    }
}
