//Baekjoon 9546

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int j = 0; j < K; j++) {
                sum = sum * 2 + 1;
            }
            System.out.println(sum);
        }
    }
}