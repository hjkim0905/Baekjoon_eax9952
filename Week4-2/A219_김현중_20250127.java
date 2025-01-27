//Baekjoon 1297

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int d = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);

        double x = Math.sqrt(h*h + w*w);
        System.out.println((int)(d*h/x) + " " + (int)(d*w/x));
    }
}