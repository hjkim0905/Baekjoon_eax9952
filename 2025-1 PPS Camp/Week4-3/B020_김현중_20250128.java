//Baekjoon 2210

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    static int[][] board;
    static HashSet<String> set = new HashSet<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, String.valueOf(board[i][j]));
            }
        }

        System.out.println(set.size());
    }

    public static void dfs(int x, int y, int depth, String number) {
        if (depth == 5) {
            set.add(number);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5) {
                dfs(nx, ny, depth + 1, number + board[nx][ny]);
            }
        }
    }
}