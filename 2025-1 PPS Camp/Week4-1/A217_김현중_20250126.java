//Baekjoon 1718

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();
        char[] key = br.readLine().toCharArray();
        int keyLength = key.length;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                System.out.print(" ");
            }
            else {
                int textIndex = text[i] - 'a';
                int keyIndex = key[i % keyLength] - 'a';
                int result = textIndex - keyIndex - 1;
                if (result < 0) {
                    result += 26;
                }
                System.out.print((char) (result + 'a'));
            }
        }
    }
}