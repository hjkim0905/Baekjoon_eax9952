//Baekjoon 17413

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean isTag = false;

        for (char ch : str.toCharArray()) {
            if (ch == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                isTag = true;
                sb.append(ch);
            }
            else if (ch == '>') {
                isTag = false;
                sb.append(ch);
            }
            else if (isTag) {
                sb.append(ch);
            }
            else {
                if (ch == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(ch);
                }
                else {
                    stack.push(ch);
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}