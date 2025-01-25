//Baekjoon 2438

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}