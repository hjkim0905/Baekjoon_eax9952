import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> bookMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            bookMap.put(book, bookMap.getOrDefault(book, 0) + 1);
        }

        String bestSeller = "";
        int maxSales = 0;

        for (Map.Entry<String, Integer> entry : bookMap.entrySet()) {
            String book = entry.getKey();
            int sales = entry.getValue();

            if (sales > maxSales || (sales == maxSales && book.compareTo(bestSeller) < 0)) {
                bestSeller = book;
                maxSales = sales;
            }
        }

        System.out.println(bestSeller);
    }
}