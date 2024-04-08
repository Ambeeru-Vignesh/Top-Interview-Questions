public class Solution {
    /**
     * @param n:     An integer
     * @param edges: a list of undirected edges
     * @return: true if it's a valid tree, or false
     */
    public boolean flag = false;

    public boolean validTree(int n, int[][] edges) {
        // write your code here
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        if (!dfs(0, graph, visited, -1)) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                if (!dfs(neighbour, graph, visited, node)) {
                    return false;
                }
            } else if (neighbour != parent) {
                return false;
            }
        }

        return true;
    }
}