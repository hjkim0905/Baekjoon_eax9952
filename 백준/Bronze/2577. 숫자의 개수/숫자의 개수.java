import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int B = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int C = Integer.parseInt(st.nextToken());

    int result = A * B * C;

    String resultString = Integer.toString(result);
    char[] arr = resultString.toCharArray();

    int[] countArr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < countArr.length; j++) {
        if ((arr[i] - '0') == j) {
          countArr[j]++;
        }
      }
    }
    for (int i = 0; i < countArr.length; i++) {
      System.out.println(countArr[i]);
    }
  }
}