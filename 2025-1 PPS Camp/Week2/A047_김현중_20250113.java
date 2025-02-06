//Baekjoon 11721

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}