//Baekjoon 1806

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (true) {
            if (sum >= S) {
                min = Math.min(min, end - start);
                sum -= arr[start++];
            }
            else if (end == N) {
                break;
            }
            else {
                sum += arr[end++];
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }
}