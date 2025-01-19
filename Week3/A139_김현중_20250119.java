//Baekjoon 1439

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (c != s.charAt(i)) {
                cnt++;
                c = s.charAt(i);
            }
        }
        System.out.println((cnt + 1) / 2);
    }
}