package practice;
import java.util.*;



public class simpledfs {
    static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        if (visited.contains(node)) return;
        visited.add(node);
        System.out.println(node + " ");
        for (int neighbor : graph.get(node)) {
            dfs(graph, neighbor, visited);
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList());
        graph.put(4, Arrays.asList());

        Set<Integer> visited = new HashSet<>();
        dfs(graph, 1, visited);
    }
}

