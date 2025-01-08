import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bufferedReader.readLine());

        int prev_count_sum = 0, cross_count = 1;

        while (true) {
            if (X <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) {
                    System.out.println((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                } else {
                    System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }
            }
            prev_count_sum += cross_count;
            cross_count++;
        }
    }
}