package data_structures.GraphsDemo.breath_first_search;

import java.util.*;

public class BFS {

    public static HashSet<String> result = new HashSet<>();

    public static void bfs(Map<String, List<String>> graph, String vertex) {
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(vertex);
        queue.add(vertex);

        while (!queue.isEmpty()) {
            String currentVertex = queue.poll();
            result.add(currentVertex);

            for (String adjacentVertex : graph.get(currentVertex)) {
                if (!visited.contains(adjacentVertex)) {
                    queue.add(adjacentVertex);
                    visited.add(adjacentVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create the graph
        Map<String, List<String>> graph = new HashMap<>();

        // Add nodes and their edges
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "D"));
        graph.put("D", Arrays.asList("B", "C", "E"));
        graph.put("E", Arrays.asList("B", "D"));

        bfs(graph, "A");
        System.out.println(result);
    }

}
