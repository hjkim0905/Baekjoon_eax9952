//Baekjoon 14627

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        long[] arr = new long[S];
        long max = 0;
        for (int i = 0; i < S; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        long left = 1;
        long right = max;
        long result = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < S; i++) {
                sum += arr[i] / mid;
            }
            if (sum >= C) {
                result = Math.max(result, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        long sum = 0;
        for (int i = 0; i < S; i++) {
            sum += arr[i];
        }
        System.out.println(sum - result * C);
    }
}