//Baekjoon 4949

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
                else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                flag = false;
            }
            if (flag) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}