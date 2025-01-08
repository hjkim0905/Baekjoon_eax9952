import java.util.*;

public class Main {
    static int[][] graph = new int[1001][1001];
    static int V;
    static int E;
    static boolean[] visited = new boolean[1001];

    public static void dfs(int start) {
        if (visited[start]) return;
        else {
            visited[start] = true;
            for(int i = 1; i <= V; i++) {
                if (graph[start][i] == 1 && !visited[i]) {
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();

        int a, b;
        for(int i = 0; i < E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        int count = 0;

        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

        sc.close();
        return;
    }
}