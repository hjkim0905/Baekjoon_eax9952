//Baekjoon 4659

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word;

        while (!(word = br.readLine()).equals("end")) {
            boolean hasVowel = false;
            boolean isAcceptable = true;
            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (isVowel(c)) {
                    hasVowel = true;
                    vowelCount++;
                    consonantCount = 0;
                } else {
                    consonantCount++;
                    vowelCount = 0;
                }

                if (vowelCount == 3 || consonantCount == 3) {
                    isAcceptable = false;
                    break;
                }

                if (i > 0 && c == word.charAt(i - 1) && c != 'e' && c != 'o') {
                    isAcceptable = false;
                    break;
                }
            }

            if (!hasVowel) {
                isAcceptable = false;
            }

            System.out.println("<" + word + "> is " +
                    (isAcceptable ? "acceptable." : "not acceptable."));
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}