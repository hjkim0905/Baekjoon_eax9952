//Baekjoon 13305

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distance = new long[N - 1];
        long[] price = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        long minPrice = price[0];
        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            sum += minPrice * distance[i];
        }
        System.out.println(sum);
    }
}