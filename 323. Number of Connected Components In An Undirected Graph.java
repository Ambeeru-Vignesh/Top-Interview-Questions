public class Solution {

    public int countComponents(int n, int[][] edges) {
        // write your code here

        int count = 0;
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adjList, visited);
                count++;
            }
        }

        return count;
    }

    public void dfs(int i, List<List<Integer>> adjList, boolean[] visited) {
        visited[i] = true;
        for (int neighbour : adjList.get(i)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adjList, visited);
            }
        }
    }
}