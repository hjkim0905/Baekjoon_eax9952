// Baekjoon 1475

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomNumber = sc.nextLine();
        int[] count = new int[10];
        int max = 0;

        for (int i = 0; i < roomNumber.length(); i++) {
            int num = roomNumber.charAt(i) - '0';
            if (num == 6 || num == 9) {
                if (count[6] <= count[9]) {
                    count[6]++;
                }
                else {
                    count[9]++;
                }
            }
            else {
                count[num]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) {
                continue;
            }
            max = Math.max(max, count[i]);
        }
        max = Math.max(max, (count[6] + count[9] + 1) / 2);
        System.out.println(max);
    }
}