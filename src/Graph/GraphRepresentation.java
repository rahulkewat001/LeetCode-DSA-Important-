package Graph;

import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        int v = 4; // no. of vertices

        // create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize empty list for each vertex
        for(int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);

        printGraph(graph);
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // because undirected
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for(int i = 0; i < graph.size(); i++) {
            System.out.println(i + " -> ");

            for(int neighbour : graph.get(i)) {
                System.out.println(neighbour + " ");
            }
            System.out.println();
        }
    }
}
