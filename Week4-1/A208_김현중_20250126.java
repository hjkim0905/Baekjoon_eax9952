//Baekjoon 17103

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= 1000000; i++) {
            if (prime[i]) continue;
            for (int j = i * 2; j <= 1000000; j += i) {
                prime[j] = true;
            }
        }
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 2; j <= n / 2; j++) {
                if (!prime[j] && !prime[n - j]) cnt++;
            }
            System.out.println(cnt);
        }
    }
}