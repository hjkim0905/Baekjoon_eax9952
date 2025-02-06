import java.util.Scanner;

public class Main {
    static int[] tree = new int[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (sc.hasNextInt()) {
            tree[i++] = sc.nextInt();
        }

        postOrder(0, i - 1);
    }

    static void postOrder(int start, int end) {
        if (start > end) {
            return;
        }

        int mid = start + 1;
        while (mid <= end && tree[mid] < tree[start]) {
            mid++;
        }

        postOrder(start + 1, mid - 1);
        postOrder(mid, end);
        System.out.println(tree[start]);
    }
}