//Baekjoon 1620

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                sb.append(arr[Integer.parseInt(input)]).append("\n");
            }
            else {
                sb.append(map.get(input)).append("\n");
            }
        }

        System.out.println(sb);
    }
}