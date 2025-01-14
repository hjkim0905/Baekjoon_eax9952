//Baekjoon 1159

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[br.readLine().charAt(0) - 'a']++;
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                System.out.print((char) (i + 'a'));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("PREDAJA");
        }
    }
}