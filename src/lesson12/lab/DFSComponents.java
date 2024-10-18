package lesson12.lab;

import java.util.*;

public class DFSComponents {

    public static void main(String [] args) {
        // 0: A
        // 1: B
        // 2: C
        // 3: D
        // 4: E
        // 5: F
        // 6: G
        // 7: H
        // 8: I
        int [][] graph = new int [][] {
                {0, 1, 1, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        Map<Integer, Integer> components = new HashMap<>();

        int v = 0; // A
        int componentLabel = 1;
        while(v < graph[0].length) {
            if (!components.containsKey(v)) {
                dfs(graph, v, components, componentLabel++);
            }
            v++;
        }

        for (Map.Entry entry : components.entrySet()) {
            System.out.println(entry.getKey() + " - Component: " + entry.getValue());
        }
    }

    static void dfs(int [][] graph, int vStart, Map<Integer, Integer> components, int componentLabel) {
        int uLength = graph[0].length;
        Stack<Integer> s = new Stack<>();

        List<Integer> visited = new ArrayList<>();

        visited.add(vStart);
        s.push(vStart);

        while(!s.empty()) {
            int v = s.peek();
            boolean hasVertexAdjacentUnvisited = false;
            for (int u = 0; u < uLength; u++) {
                if (graph[v][u] == 1 && !visited.contains(u)) {
                    visited.add(u);
                    s.push(u);
                    hasVertexAdjacentUnvisited = true;
                    break;
                }
            }

            if (!hasVertexAdjacentUnvisited) {
                components.put(s.pop(), componentLabel);
            }
        }
    }
}
