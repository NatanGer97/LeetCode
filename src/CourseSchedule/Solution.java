package CourseSchedule;

import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int visited[] = new int[numCourses];
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        // init graph
        for (int[] prerequisite : prerequisites) {
            if (graph.containsKey(prerequisite[1])) {
                graph.get(prerequisite[1]).add(prerequisite[0]);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(prerequisite[0]);
                graph.put(prerequisite[1], list);
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, visited, graph)) return false;

        }
        return true;
    }

    public boolean dfs(int node, int[] visited, Map<Integer, ArrayList<Integer>> graph) {
        if (visited[node] == -1) return false; // current node in searching path
        if (visited[node] == 1) return true; // current node has been searched

        visited[node] = -1; // mark current node as searching
        if (graph.containsKey(node)) {
            for (int i : graph.get(node)) {
                if (!dfs(i, visited, graph)) return false;
            }

        }
        visited[node] = 1; // mark current node as searched
        return true;
    }
}
