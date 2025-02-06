//Baekjoon 3062

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            String str2 = new StringBuilder(str).reverse().toString();
            int num = Integer.parseInt(str) + Integer.parseInt(str2);
            String str3 = Integer.toString(num);
            String str4 = new StringBuilder(str3).reverse().toString();
            if (str3.equals(str4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}