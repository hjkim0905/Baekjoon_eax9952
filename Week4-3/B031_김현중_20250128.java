//Baekjoon 3135

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int A, B, N;
    static int[] channels;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        N = Integer.parseInt(br.readLine());
        channels = new int[N];

        for (int i = 0; i < N; i++) {
            channels[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            answer = Math.min(answer, Math.abs(channels[i] - B) + 1);
        }

        answer = Math.min(answer, Math.abs(A - B));

        System.out.println(answer);
    }
}