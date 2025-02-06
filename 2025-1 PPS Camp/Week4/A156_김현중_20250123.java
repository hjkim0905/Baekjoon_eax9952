//Baekjoon 2805

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] tree = new int[N];
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]);
        }

        long left = 0;
        long right = max;
        long mid = 0;
        long sum = 0;
        long result = 0;

        while(left <= right) {
            sum = 0;
            mid = (left + right) / 2;
            for(int i = 0; i < N; i++) {
                if(tree[i] > mid) {
                    sum += tree[i] - mid;
                }
            }
            if(sum >= M) {
                result = Math.max(result, mid);
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}