//Baekjoon 1935

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Double> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                stack.push((double) arr[ch - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}