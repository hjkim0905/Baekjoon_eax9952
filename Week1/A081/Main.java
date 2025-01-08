import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < t; i++) {
                int[] array = new int[10];
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 10; j++) {
                    array[j] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(array);
                sb.append(array[7]).append("\n");
            }
            System.out.println(sb);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}