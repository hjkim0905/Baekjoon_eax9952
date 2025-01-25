//Baekjoon 1676

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i=5; i<=n; i*=5) {
            count += n/i;
        }

        System.out.println(count);
    }
}