//Baekjoon 14248

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine()) - 1; // Convert to 0-based index
        dfs(s);
        System.out.println(answer);
    }

    public static void dfs(int s) {
        if(s < 0 || s >= n || visited[s]) return;

        visited[s] = true;
        answer++;

        dfs(s - arr[s]);
        dfs(s + arr[s]);
    }
}