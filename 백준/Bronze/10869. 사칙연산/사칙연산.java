import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] results = new int[5];
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		results[0] = a + b;
		results[1] = a - b;
		results[2] = a * b;
		results[3] = a / b;
		results[4] = a % b;

		for (int i = 0; i < 5; i++) {
			System.out.println(results[i]);
		}
	}
}