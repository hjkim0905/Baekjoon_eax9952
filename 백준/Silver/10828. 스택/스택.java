import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				push(arr, num);
			}

			if (command.equals("pop")) {
				pop(arr, result);
			}

			if (command.equals("size")) {
				size(arr, result);
			}

			if (command.equals("empty")) {
				empty(arr, result);
			}

			if (command.equals("top")) {
				top(arr, result);
			}
		}
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	public static void push(ArrayList<Integer> arr, int n) {
		arr.add(n);
	}

	public static void pop(ArrayList<Integer> arr, ArrayList<Integer> result) {
		if(arr.isEmpty()) {
			result.add(-1);
		}
		else {
			result.add(arr.get(arr.size() - 1));
			arr.remove(arr.size() - 1);
		}
	}

	public static void size(ArrayList<Integer> arr, ArrayList<Integer> result) {
		result.add(arr.size());
	}

	public static void empty(ArrayList<Integer> arr, ArrayList<Integer> result) {
		if (arr.isEmpty()) {
			result.add(1);
		} else {
			result.add(0);
		}
	}
	
	public static void top(ArrayList<Integer> arr, ArrayList<Integer> result) {
		if (arr.isEmpty()) {
			result.add(-1);
		}
		else {
			result.add(arr.get(arr.size() - 1));
		}
	}
}