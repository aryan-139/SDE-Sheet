class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // declaring an array liust
        ArrayList<Integer> bfs = new ArrayList<>();
        // initialising a queue
        Queue<Integer> q = new LinkedList<>();
        // initialising a visited array
        boolean vis[] = new boolean[V];
        vis[0] = true;
        q.add(0);
        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);
            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    q.add(it);
                    vis[it] = true;
                }
            }
        }
        return (bfs);
    }
}
