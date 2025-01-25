import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();
        int count = N / 4;

        for (int i = 0; i < count; i++) {
            result.append("long ");
        }
        result.append("int");

        System.out.println(result.toString());
    }
}