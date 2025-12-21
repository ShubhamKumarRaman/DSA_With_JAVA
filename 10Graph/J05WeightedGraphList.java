import java.util.ArrayList;

public class J05WeightedGraphList {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String args[]) {
        int V = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(0).add(new Edge(0, 2, 4));
        graph.get(1).add(new Edge(1, 0, 2));
        graph.get(1).add(new Edge(1, 3, 7));
        graph.get(2).add(new Edge(2, 0, 4));
        graph.get(2).add(new Edge(2, 4, 1));
        graph.get(3).add(new Edge(3, 1, 7));
        graph.get(4).add(new Edge(4, 2, 1));

        System.out.println("Graph:- ");
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex: " + i + " -> ");
            for (Edge e : graph.get(i)) {
                System.out.print("(" + e.dest + ", wt=" + e.wt + ")");
            }
            System.out.println();
        }

    }
}
