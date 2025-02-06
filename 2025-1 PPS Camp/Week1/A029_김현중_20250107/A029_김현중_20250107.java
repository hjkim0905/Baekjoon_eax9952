import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();

        if (n >= 6) {
            System.out.println("Love is open door");
            return;
        }

        for (int i = 1; i < n; i++) {
            System.out.println((m + i) % 2);
        }
    }
}