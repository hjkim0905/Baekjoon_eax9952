//Baekjoon 1212

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringBuilder sb = new StringBuilder();

        if(n.equals("0")) {
            System.out.println(0);
            return;
        }

        for(int i=0; i<n.length(); i++) {
            int num = n.charAt(i) - '0';
            StringBuilder temp = new StringBuilder();

            while(num > 0) {
                temp.append(num%2);
                num /= 2;
            }

            if(i != 0 && temp.length() != 3) {
                while(temp.length() != 3) {
                    temp.append(0);
                }
            }

            sb.append(temp.reverse());
        }

        System.out.println(sb);
    }
}