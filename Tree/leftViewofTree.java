class Tree {
    // Function to return a list containing elements of the left view of the binary tree.
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        leftViewUtil(root, result, 1);
        return result;
    }

    // Recursive utility function to find the left view elements
    private void leftViewUtil(Node node, List<Integer> result, int depth) {
        if (node == null) {
            return;
        }

        // If this is the first node at the current depth, add it to the result
        if (depth > result.size()) {
            result.add(node.data);
        }

        // Traverse the left subtree before the right subtree
        leftViewUtil(node.left, result, depth + 1);
        leftViewUtil(node.right, result, depth + 1);
    }
}
