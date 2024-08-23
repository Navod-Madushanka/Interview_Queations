package data_structures.GraphsDemo.depth_first_search;

import java.util.*;

public class DFS {
    public static Set<String> dfs(HashMap<String, List<String>> graph, String vertex) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();

        stack.push(vertex);

        while (!stack.isEmpty()) {
            String currentVertex = stack.pop();

            if (!visited.contains(currentVertex)) {
                visited.add(currentVertex);

                for (String adjacentVertex : graph.get(currentVertex)) {
                    if (!visited.contains(adjacentVertex)) {
                        stack.push(adjacentVertex);
                    }
                }
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        // Create the graph
        HashMap<String, List<String>> graph = new HashMap<>();

        // Add nodes and their edges
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "D"));
        graph.put("D", Arrays.asList("B", "C", "E"));
        graph.put("E", Arrays.asList("B", "D"));

        // Perform DFS starting from vertex "A"
        Set<String> result = dfs(graph, "B");
        System.out.println(result);
    }
}
