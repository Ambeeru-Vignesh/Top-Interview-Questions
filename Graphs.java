import java.util.Scanner;

public class Graphs {

    // Adjacent Matrix
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int adj[][] = new int[v][v];

        for (int i = 0; i < e; i++) {

            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adj[v1][v2] = 1;
            adj[v2][v1] = 1;
        }

        System.out.println("Adjacency Matrix: ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Adjacent Lists

    
}


