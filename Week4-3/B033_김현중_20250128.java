//Baekjoon 10162

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        if (T % 10 != 0) {
            System.out.println(-1);
            return;
        }

        int A = T / 300;
        T %= 300;
        int B = T / 60;
        T %= 60;
        int C = T / 10;

        System.out.println(A + " " + B + " " + C);
    }
}