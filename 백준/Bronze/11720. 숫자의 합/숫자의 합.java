import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> input = new ArrayList<>();
    char[] inputNums = br.readLine().toCharArray();

    for (int i = 0; i < N; i++) {
      input.add(Character.getNumericValue(inputNums[i]));
    }

    int sum = 0;
    for (int i = 0; i < input.size(); i++) {
      sum += input.get(i);
    }

    System.out.println(sum);
  }
}