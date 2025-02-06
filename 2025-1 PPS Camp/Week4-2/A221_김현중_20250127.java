//Baekjoon 5988

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            int last = input.charAt(input.length()-1) - '0';
            System.out.println(last % 2 == 0 ? "even" : "odd");
        }
    }
}