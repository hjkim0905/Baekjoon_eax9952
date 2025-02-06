import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());
        int[] dir = new int[M + 1];
        int[] speed = new int[M + 1];
        int d = 0;
        long rotation = 1;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            if (s == 1) {
                d = 1 - d;
            }

            rotation = rotation * b / a;
        }

        System.out.println(d + " " + rotation);
    }
}