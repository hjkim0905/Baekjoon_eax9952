import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cost = Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10, 5, 1};
        int change = 1000 - cost;

        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (change / coins[i] > 0) {
                count += change / coins[i];
                change %= coins[i];
            }
        }
        System.out.println(count);
    }
}