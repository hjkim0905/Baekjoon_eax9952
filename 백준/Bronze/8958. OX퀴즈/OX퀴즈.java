import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      int result = 0;
      int add = 0;
      
      String testCase = br.readLine();
      for (int j = 0; j < testCase.length(); j++) {
        if (testCase.charAt(j) == 'O') {
          add++;
          result += add;
        }
        else {
          add = 0;
        }
      }
      System.out.println(result);
    }
  }
}