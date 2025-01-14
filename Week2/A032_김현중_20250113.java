//Baekjoon 2775

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[k + 1][n];
            for (int j = 0; j < n; j++) {
                arr[0][j] = j + 1;
            }
            for (int j = 1; j <= k; j++) {
                for (int l = 0; l < n; l++) {
                    for (int m = 0; m <= l; m++) {
                        arr[j][l] += arr[j - 1][m];
                    }
                }
            }
            System.out.println(arr[k][n - 1]);
        }
    }
}