//Baekjoon 1654

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[K];
        long max = 0;

        for(int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        long left = 1;
        long right = max;
        long mid = 0;

        while(left <= right) {
            mid = (left + right) / 2;
            long cnt = 0;

            for(int i = 0; i < K; i++) {
                cnt += arr[i] / mid;
            }

            if(cnt >= N) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }
}