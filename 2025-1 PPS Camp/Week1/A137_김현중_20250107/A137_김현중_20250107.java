import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        long left = 1;
        long right = K;

        while (left < right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
            }
            if (cnt < K) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        System.out.println(left);
    }
}