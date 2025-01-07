import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LinkedList<int[]> queue = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                queue.offer(new int[] {i, sc.nextInt()});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean isMax = true;

                for (int i = 0; i < queue.size(); i++) {
                    if (front[1] < queue.get(i)[1]) {
                        queue.offer(front);
                        for (int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                count++;
                if (front[0] == M) {
                    break;
                }
            }

            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}