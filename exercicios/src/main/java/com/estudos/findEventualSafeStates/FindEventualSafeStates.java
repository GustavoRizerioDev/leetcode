package com.estudos.findEventualSafeStates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, color)) {
                result.add(i);
            }
        }
        Collections.sort(result);
        return result;
    }

    private boolean dfs(int node, int[][] graph, int[] color) {
        if (color[node] > 0) {
            return color[node] == 2;
        }
        color[node] = 1;
        for (int next : graph[node]) {
            if (color[next] == 2) {
                continue;
            }
            if (color[next] == 1 || !dfs(next, graph, color)) {
                return false;
            }
        }
        color[node] = 2;
        return true;
    }
}
