//Baekjoon 9237

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(trees);

        int answer = 0;
        for (int i = N - 1; i >= 0; i--) {
            answer = Math.max(answer, trees[i] + N - i);
        }

        System.out.println(answer + 1);
    }
}