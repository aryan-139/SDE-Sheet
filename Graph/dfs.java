

class Solution {

    public void dfs(int V, ArrayList<ArrayList<Integer>> adj,int currentVertice,boolean[]visited,ArrayList<Integer>ans) {

        visited[currentVertice]=true;// this will us to know that this node has been visited

        ans.add(currentVertice);// adding the nodes by traverserving with the help of the loop below this statement

        for(int i=0; i<adj.get(currentVertice).size(); i++){

            if(!visited[adj.get(currentVertice).get(i)])  dfs(V,adj,adj.get(currentVertice).get(i),visited,ans);

// if we haven't visited the node then only we will traverse otherwise we will look for another node which is connected to the current node and has not been traversed by calling the dfs function by again/ recusively

        }

    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V]; // this boolean array will help us to if the node has been traverses or not 

        ArrayList<Integer> ans = new ArrayList<>();// this ans data structure will put all the node's value 

        dfs(V,adj,0,visited,ans);

        return ans;

    }

}
