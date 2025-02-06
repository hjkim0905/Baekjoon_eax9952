//Baekjoon 18258

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int last = 0;

        while (n-- > 0) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    last = Integer.parseInt(input[1]);
                    q.offer(last);
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.poll()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append('\n');
                    break;
                case "back":
                    sb.append(q.isEmpty() ? -1 : last).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}