//Baekjoon 11050

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        System.out.println(factorial(n) / (factorial(k) * factorial(n-k)));
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
}