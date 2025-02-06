import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = 0;
        int m = 0;

        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(st.nextToken());

            y += ((time / 30) + 1) * 10;

            m += ((time / 60) + 1) * 15;
        }

        if (y < m) {
            System.out.println("Y " + y);
        } else if (y > m) {
            System.out.println("M " + m);
        } else {
            System.out.println("Y M " + y);
        }
    }
}