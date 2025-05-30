import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        long tCount = 0;
        int pCount = 0;

        for (int i = 0; i < 6; i++) {
            if (arr[i] == 0)
                continue;
            else if ((arr[i] / T == 1) && (arr[i] % T == 0))
                tCount++;
            else if ((arr[i] / T < 1) && (arr[i] % T != 0))
                tCount++;
            else if ((arr[i] / T > 1) && (arr[i] % T == 0)) {
                tCount += arr[i] / T;
            }
            else {
                tCount += ((arr[i] / T) + 1);
            }
        }

        pCount += N / P;

        sb.append(tCount).append('\n').append(pCount).append(' ').append(N % P);
        System.out.println(sb);
    }
}