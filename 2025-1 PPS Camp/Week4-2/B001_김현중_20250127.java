//Baekjoon 2606

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n+1];
        System.out.println(dfs(graph, visited, 1) - 1);
    }

    public static int dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int start) {
        visited[start] = true;
        int count = 1;

        for(int i = 0; i < graph.get(start).size(); i++) {
            int next = graph.get(start).get(i);
            if(!visited[next]) {
                count += dfs(graph, visited, next);
            }
        }

        return count;
    }
}