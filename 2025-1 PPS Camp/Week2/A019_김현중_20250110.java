//Baekjoon 2577

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Integer.parseInt(br.readLine());
        }
        String str = Integer.toString(result);
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}