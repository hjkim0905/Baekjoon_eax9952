import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int numTest = Integer.parseInt(st.nextToken());

    for (int i = 0; i < numTest; i++) {
      st = new StringTokenizer(br.readLine());
      int repeat = Integer.parseInt(st.nextToken());
      String word = st.nextToken();

      char[] arr = word.toCharArray();
      for (int j = 0; j < arr.length; j++) {
        char result = arr[j];
        for (int k = 0; k < repeat; k++) {
          sb.append(result);
        }
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}