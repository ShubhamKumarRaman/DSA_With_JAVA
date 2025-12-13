import java.util.ArrayList;
import java.util.Collections;

public class J01UndirectedAdjacencyMatrix {
    public static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        // Initialize the matrix with 0
        for (int i = 0; i < V; i++) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V, 0));
            mat.add(row);
        }

        // Add each node to adjacency matrix
        for (int[] it : edges) {
            int u = it[0];
            int v = it[1];

            mat.get(u).set(v, 1);
            mat.get(v).set(u, 1);
        }
        return mat;
    }

    public static void main(String args[]) {
        int V = 3;
        int[][] edges = {
                { 0, 1 },
                { 0, 2 },
                { 1, 2 }
        };

        // Build the graph using edges
        ArrayList<ArrayList<Integer>> result = createGraph(V, edges);

        System.out.println("Adjacency Matrix representation: ");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(result.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }
}