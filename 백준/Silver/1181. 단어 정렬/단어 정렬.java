import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        Set<String> words = new HashSet<>();
        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }
        String[] arr = words.toArray(new String[0]);

        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            else {
                return s1.length() - s2.length();
            }
        });
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}