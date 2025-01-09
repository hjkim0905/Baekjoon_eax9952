import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int sum = 0;
            boolean[] alphabets = new boolean[26];

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int index = c - 'A';
                alphabets[index] = true;
            }

            for (int j = 0; j < 26; j++) {
                if (!alphabets[j]) {
                    sum += j + 'A';
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}