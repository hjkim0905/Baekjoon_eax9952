//Baekjoon 2251

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int A, B, C;
    static boolean[][][] visited;
    static Set<Integer> results;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        A = Integer.parseInt(input[0]);
        B = Integer.parseInt(input[1]);
        C = Integer.parseInt(input[2]);

        visited = new boolean[201][201][201];
        results = new TreeSet<>();

        bfs(0, 0, C);

        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    public static void bfs(int a, int b, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, b, c});
        visited[a][b][c] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            a = current[0];
            b = current[1];
            c = current[2];

            if (a == 0) {
                results.add(c);
            }

            // Pour water from one container to another
            pour(queue, a, b, c);
        }
    }

    public static void pour(Queue<int[]> queue, int a, int b, int c) {
        // a -> b
        transfer(queue, a, b, c, Math.min(a, B - b), a - Math.min(a, B - b), b + Math.min(a, B - b), c);
        // a -> c
        transfer(queue, a, b, c, Math.min(a, C - c), a - Math.min(a, C - c), b, c + Math.min(a, C - c));
        // b -> a
        transfer(queue, a, b, c, Math.min(b, A - a), a + Math.min(b, A - a), b - Math.min(b, A - a), c);
        // b -> c
        transfer(queue, a, b, c, Math.min(b, C - c), a, b - Math.min(b, C - c), c + Math.min(b, C - c));
        // c -> a
        transfer(queue, a, b, c, Math.min(c, A - a), a + Math.min(c, A - a), b, c - Math.min(c, A - a));
        // c -> b
        transfer(queue, a, b, c, Math.min(c, B - b), a, b + Math.min(c, B - b), c - Math.min(c, B - b));
    }

    public static void transfer(Queue<int[]> queue, int a, int b, int c, int amount, int newA, int newB, int newC) {
        if (!visited[newA][newB][newC]) {
            visited[newA][newB][newC] = true;
            queue.add(new int[]{newA, newB, newC});
        }
    }
}