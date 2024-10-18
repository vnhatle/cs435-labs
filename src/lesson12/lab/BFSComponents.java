package lesson12.lab;

import java.util.*;

public class BFSComponents {

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
                bfs(graph, v, components, componentLabel++);
            }
            v++;
        }

        for (Map.Entry entry : components.entrySet()) {
            System.out.println(entry.getKey() + " - Component: " + entry.getValue());
        }
    }

    static void bfs(int [][] graph, int vStart, Map<Integer, Integer> components, int componentLabel) {
        int uLength = graph[0].length;
        Queue<Integer> q = new LinkedList<>();

        List<Integer> visited = new ArrayList<>();

        visited.add(vStart);
        q.add(vStart);

        while(!q.isEmpty()) {
            int v = q.poll();
            components.put(v, componentLabel);

            for (int u = 0; u < uLength; u++) {
                if (graph[v][u] == 1 && !visited.contains(u)) {
                    visited.add(u);
                    q.add(u);
                }
            }
        }

    }
}
