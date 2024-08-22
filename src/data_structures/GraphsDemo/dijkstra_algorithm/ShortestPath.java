package data_structures.GraphsDemo.dijkstra_algorithm;

import java.util.*;

class ShortestPath {
    static final int TOTAL_VERTICES = 9;

    // A utility function to find the vertex with the minimum distance value
    // from the set of vertices not yet included in the shortest path tree
    int findVertexWithMinimumDistance(int[] distances, Boolean[] shortestPathTreeSet) {
        int minimumDistance = Integer.MAX_VALUE;
        int minimumIndex = -1;

        for (int vertex = 0; vertex < TOTAL_VERTICES; vertex++) {
            if (!shortestPathTreeSet[vertex] && distances[vertex] <= minimumDistance) {
                minimumDistance = distances[vertex];
                minimumIndex = vertex;
            }
        }

        return minimumIndex;
    }

    // A utility function to print the constructed distance array
    void printShortestDistances(int[] distances) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int vertex = 0; vertex < TOTAL_VERTICES; vertex++) {
            System.out.println(vertex + " \t\t " + distances[vertex]);
        }
    }

    // Function that implements Dijkstra's single source shortest path algorithm
    // for a graph represented using an adjacency matrix representation
    void dijkstra(int[][] graph, int sourceVertex) {
        int[] shortestDistances = new int[TOTAL_VERTICES]; // The output array that holds the shortest distance from the source to each vertex
        Boolean[] shortestPathTreeSet = new Boolean[TOTAL_VERTICES]; // Boolean array to mark vertices included in the shortest path tree

        // Initialize all distances as INFINITE and shortestPathTreeSet[] as false
        for (int vertex = 0; vertex < TOTAL_VERTICES; vertex++) {
            shortestDistances[vertex] = Integer.MAX_VALUE;
            shortestPathTreeSet[vertex] = false;
        }

        // Distance of the source vertex from itself is always 0
        shortestDistances[sourceVertex] = 0;

        // Find the shortest path for all vertices
        for (int count = 0; count < TOTAL_VERTICES - 1; count++) {
            // Pick the vertex with the minimum distance value from the set of vertices
            // not yet processed. 'u' is always equal to sourceVertex in the first iteration.
            int u = findVertexWithMinimumDistance(shortestDistances, shortestPathTreeSet);

            // Mark the picked vertex as processed
            shortestPathTreeSet[u] = true;

            // Update the distance value of the adjacent vertices of the picked vertex
            for (int v = 0; v < TOTAL_VERTICES; v++) {
                // Update shortestDistances[v] only if it is not in shortestPathTreeSet, there is an edge from u to v,
                // and the total weight of the path from the source to v through u is smaller than the current value of shortestDistances[v]
                if (!shortestPathTreeSet[v] && graph[u][v] != 0 &&
                        shortestDistances[u] != Integer.MAX_VALUE &&
                        shortestDistances[u] + graph[u][v] < shortestDistances[v]) {
                    shortestDistances[v] = shortestDistances[u] + graph[u][v];
                }
            }
        }

        // Print the constructed distance array
        printShortestDistances(shortestDistances);
    }

    // Driver's code
    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        ShortestPath sp = new ShortestPath();

        // Function call
        sp.dijkstra(graph, 0);
    }
}
