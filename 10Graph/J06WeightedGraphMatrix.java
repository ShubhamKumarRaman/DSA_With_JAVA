public class J06WeightedGraphMatrix {
    static int V = 5;
    static int[][] graph = new int[V][V];

    // Add Edge
    public static void addEdge(int src, int dest, int wt) {
        graph[src][dest] = wt;
    }

    // Print graph
    public static void printGraph() {
        System.out.println("Adjacency Matrix: ");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        addEdge(0, 1, 2);
        addEdge(0, 2, 4);
        addEdge(1, 0, 2);
        addEdge(1, 3, 7);
        addEdge(2, 0, 4);
        addEdge(2, 4, 1);
        addEdge(3, 1, 7);
        addEdge(4, 2, 1);

        printGraph();
    }
}
