import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                arr.add(temp % 10);
                temp /= 10;
            }
            for (int j = 0; j < arr.size(); j++) {
                sum += arr.get(j);
            }
            if ((i + sum) == N) {
                System.out.println(i);
                break;
            }
            if (i == N) {
                System.out.println(0);
                break;
            }
        }
    }
}