//Baekjoon 10178

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int c = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            System.out.println("You get " + c/v + " piece(s) and your dad gets " + c%v + " piece(s).");
        }
    }
}