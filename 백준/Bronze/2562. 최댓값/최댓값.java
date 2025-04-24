import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[9];

    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int[] sortedArr = arr.clone();
    Arrays.sort(sortedArr);

    int max = sortedArr[8];
    int placeNum = 0;

    for (int i = 0; i < 9; i++) {
      if (arr[i] == max) {
        placeNum = i + 1;
      }
    }
    System.out.println(max);
    System.out.println(placeNum);
  }
}