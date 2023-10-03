import java.util.*;

public class Graphs_AdjList {

    private Map<Integer, List<Integer>> adjList;

    public Graphs_AdjList() {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjList.put(v, new ArrayList<>());
    }

    public void addEdge(int v1, int v2) {
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        Graphs_AdjList graph = new Graphs_AdjList();

        for (int i = 0; i < v; i++) {
            graph.addVertex(i);
        }

        int e = sc.nextInt();

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph.addEdge(v1, v2);
        }
        graph.printGraph();
    }

}
