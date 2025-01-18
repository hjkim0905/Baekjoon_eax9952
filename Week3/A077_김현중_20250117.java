//Baekjoon 2822

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] score = new int[8][2];
        int[] result = new int[5];
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            st = new StringTokenizer(br.readLine());
            score[i][0] = Integer.parseInt(st.nextToken());
            score[i][1] = i + 1;
        }
        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        for (int i = 0; i < 5; i++) {
            sum += score[i][0];
            result[i] = score[i][1];
        }
        Arrays.sort(result);
        System.out.println(sum);
        for (int i = 0; i < 5; i++) {
            System.out.print(result[i] + " ");
        }
    }
}