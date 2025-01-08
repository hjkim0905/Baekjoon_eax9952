// Baekjoon 4344

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            double avg = (double) sum / N;
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (double) count / N * 100);
        }
    }
}