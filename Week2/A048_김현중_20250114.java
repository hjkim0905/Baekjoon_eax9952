//Baekjoon 1316

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] check = new boolean[26];
            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';

                if (check[index] == false) {
                    check[index] = true;
                }
                else {
                    if (word.charAt(j - 1) != word.charAt(j)) {
                        isGroupWord = false;
                        break;
                    }
                }
            }

            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);
    }
}