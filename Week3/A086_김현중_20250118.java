//Baekjoon 1755

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        String num[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[] arr = new String[N - M + 1];
        int[] originalNumbers = new int[N - M + 1];

        for (int i = M; i <= N; i++) {
            originalNumbers[i - M] = i;
            if (i < 10) {
                arr[i - M] = num[i];
            }
            else {
                arr[i - M] = num[i / 10] + " " + num[i % 10];
            }
        }

        Integer[] indices = new Integer[N - M + 1];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return arr[o1].compareTo(arr[o2]);
            }
        });

        for (int i = 0; i < indices.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(originalNumbers[indices[i]]);
            if (i != indices.length - 1) {
                System.out.print(" ");
            }
        }
    }
}