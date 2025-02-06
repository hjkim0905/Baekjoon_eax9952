//Baekjoon 17087

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int[] a = new int[n];
        int gcd = 0;

        input = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(input[i]);
            if(i == 0) {
                gcd = Math.abs(s-a[i]);
            } else {
                gcd = gcd(gcd, Math.abs(s-a[i]));
            }
        }

        System.out.println(gcd);
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}