//Baekjoon 1427

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] arr = new int[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }
        Arrays.sort(arr);
        for (int i = N.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}