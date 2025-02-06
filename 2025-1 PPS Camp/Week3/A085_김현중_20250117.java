//Baekjoon 1431

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] serial = new String[N];
        for (int i = 0; i < N; i++) {
            serial[i] = br.readLine();
        }
        Arrays.sort(serial, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) >= '0' && o1.charAt(i) <= '9') {
                            sum1 += o1.charAt(i) - '0';
                        }
                        if (o2.charAt(i) >= '0' && o2.charAt(i) <= '9') {
                            sum2 += o2.charAt(i) - '0';
                        }
                    }
                    if (sum1 == sum2) {
                        return o1.compareTo(o2);
                    }
                    return Integer.compare(sum1, sum2);
                }
                return Integer.compare(o1.length(), o2.length());
            }
        });
        for (String s : serial) {
            System.out.println(s);
        }
    }
}