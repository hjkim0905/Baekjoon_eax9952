//Bakejoon 2110

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int left = 1;
        int right = arr[N - 1] - arr[0];
        int mid = 0;
        int result = 0;

        while(left <= right) {
            mid = (left + right) / 2;
            int cnt = 1;
            int start = arr[0];

            for(int i = 1; i < N; i++) {
                if(arr[i] - start >= mid) {
                    cnt++;
                    start = arr[i];
                }
            }

            if(cnt >= C) {
                result = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}