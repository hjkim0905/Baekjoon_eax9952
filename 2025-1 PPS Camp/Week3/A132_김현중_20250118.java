//Baekjoon 1002

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            if (d == 0 && r1 == r2) {
                sb.append("-1\n");
            }
            else if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                sb.append("1\n");
            }
            else if (d > r1 + r2 || d < Math.abs(r1 - r2)) {
                sb.append("0\n");
            }
            else {
                sb.append("2\n");
            }
        }
        System.out.println(sb);
    }
}