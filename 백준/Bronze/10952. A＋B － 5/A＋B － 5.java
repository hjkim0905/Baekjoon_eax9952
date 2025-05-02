import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		ArrayList<Integer> arr = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			}

			arr.add(a);
			arr.add(b);
		}

		for (int i = 0; i < arr.size(); i += 2) {
			System.out.println(arr.get(i) + arr.get(i + 1));
		}
	}
}