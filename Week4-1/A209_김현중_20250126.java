//Baekjoon 11576

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int m = Integer.parseInt(br.readLine());
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        input = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            num += Integer.parseInt(input[i]) * Math.pow(A, m - i - 1);
        }
        while (num > 0) {
            stack.push(num % B);
            num /= B;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}