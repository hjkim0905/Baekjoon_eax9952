// Baekjoon 10757

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        int lenA = A.length();
        int lenB = B.length();
        int maxLen = Math.max(lenA, lenB);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            int sum = carry;
            if (i < lenA) {
                sum += A.charAt(lenA - 1 - i) - '0';
            }
            if (i < lenB) {
                sum += B.charAt(lenB - 1 - i) - '0';
            }
            carry = sum / 10;
            sb.append(sum % 10);
        }
        if (carry > 0) {
            sb.append(carry);
        }
        System.out.println(sb.reverse());
    }
}