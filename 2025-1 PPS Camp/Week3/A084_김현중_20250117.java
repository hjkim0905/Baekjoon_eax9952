//Baekjoon 11656

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add(input.substring(i));
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}