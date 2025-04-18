// Baekjoon 2475

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

        System.out.println(sum % 10);
    }
}