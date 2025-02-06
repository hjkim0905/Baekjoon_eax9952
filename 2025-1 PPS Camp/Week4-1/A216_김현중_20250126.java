//Baekjoon 1284

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            }
            int length = n.length();
            int sum = 2 + length - 1; // 양 끝 여백 2cm + 숫자 사이 여백 (length - 1) * 1cm
            for (int i = 0; i < length; i++) {
                char c = n.charAt(i);
                if (c == '1') {
                    sum += 2;
                } else if (c == '0') {
                    sum += 4;
                } else {
                    sum += 3;
                }
            }
            System.out.println(sum);
        }
    }
}