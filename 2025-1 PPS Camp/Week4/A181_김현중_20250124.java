//Baekjoon 2588

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = b;
        while (b > 0) {
            System.out.println(a * (b % 10));
            b /= 10;
        }
        System.out.println(a * c);
    }
}