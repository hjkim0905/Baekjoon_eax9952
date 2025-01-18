//Baekjoon 1049

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minPackage = 1000;
        int minPiece = 1000;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            minPackage = Math.min(minPackage, Integer.parseInt(st.nextToken()));
            minPiece = Math.min(minPiece, Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        if(minPackage < minPiece * 6) {
            result = Math.min((N / 6) * minPackage + (N % 6) * minPiece, (N / 6 + 1) * minPackage);
        }
        else {
            result = N * minPiece;
        }

        System.out.println(result);
    }
}