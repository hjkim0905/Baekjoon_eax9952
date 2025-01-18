//Baekjoon 10867

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
            }
        });

        for(int i = 0; i < N; i++) {
            if (i > 0 && arr[i].equals(arr[i - 1])) {
                continue;
            } else {
                sb.append(arr[i]).append(' ');
            }
        }

        System.out.print(sb);
        System.out.println();
    }
}