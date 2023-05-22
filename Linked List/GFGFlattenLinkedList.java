class GfG {
    Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }
        
        // Create a priority queue with a custom comparator to compare nodes based on their data
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        
        // Add all the nodes to the priority queue
        Node curr = root;
        while (curr != null) {
            pq.add(curr);
            curr = curr.next;
        }
        
        // Create a dummy node to build the flattened list
        Node dummy = new Node(0);
        Node tail = dummy;
        
        // Dequeue nodes from the priority queue and link them together
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            tail.bottom = node;
            tail = tail.bottom;
            
            // If the node has a bottom node, add it to the priority queue
            if (node.bottom != null) {
                pq.add(node.bottom);
            }
        }
        
        return dummy.bottom;
    }
}

//MUST REVISIT
