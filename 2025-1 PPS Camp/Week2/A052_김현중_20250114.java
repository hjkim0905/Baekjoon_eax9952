//Baekjoon 8958

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String result = br.readLine();
            int score = 0;
            int count = 0;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == 'O') {
                    count++;
                    score += count;
                }
                else {
                    count = 0;
                }
            }

            System.out.println(score);
        }
    }
}