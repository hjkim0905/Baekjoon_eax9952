//Baekjoon 17211

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        double M = Integer.parseInt(st.nextToken());

        double[] arr = Arrays.stream(in.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        M = (1 - M) * 1000;

        for (int i = 0; i < N; ++i) {
            M = M * arr[0] + (1000 - M) * arr[2];
        }

        System.out.println(String.format("%.0f", M));
        System.out.println(String.format("%.0f", 1000 - M));
    }
}