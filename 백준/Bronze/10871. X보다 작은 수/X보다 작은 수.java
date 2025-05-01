import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> inputNum = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			inputNum.add(Integer.parseInt(st.nextToken()));
		}

		for (int i = 0; i < inputNum.size(); i++) {
			if (inputNum.get(i) < X) {
				sb.append(inputNum.get(i)).append(' ');
			}
		}

		System.out.println(sb.toString());
	}
}