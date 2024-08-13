package recursion.depth_first_search_graphs.dfs_for_undirect_graphs;

import java.util.ArrayList;
import java.util.List;

public class GfG {
    static void addEdge(List<List<Integer>> adj, int s, int t) {
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

//    Recursive Function for DFS Traversal
    static void DFSRec(List<List<Integer>> adj,boolean [] visited ,int s) {
        visited[s] = true;
        System.out.print(s + " ");

        for(int i : adj.get(s)) {
            if(!visited[i]) {
                DFSRec(adj,visited,i);
            }
        }
    }

//    Main DFS Function that initializes the visited array
    static void DFS(List<List<Integer>> adj, int s){
        boolean[] visited = new boolean[adj.size()];
        DFSRec(adj,visited,s);
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices in the graph

        // Create an adjacency list for the graph
        List<List<Integer> > adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Define the edges of the graph
        int[][] edges = {
                { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3 }, { 2, 4 }
        };

        // Populate the adjacency list with edges
        for (int[] e : edges) {
            addEdge(adj, e[0], e[1]);
        }

        int source = 1;
        System.out.println("DFS from source: " + source);
        DFS(adj, source);
    }
}
