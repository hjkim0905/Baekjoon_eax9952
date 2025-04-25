import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] numArr = new int[3];
    String[] charArr = new String[3];

    for (int i = 0; i < 3; i++) {
      String st = br.readLine();
      numArr[i] = Integer.parseInt(st);
      charArr[i] = st;
    }

    int numResult = numArr[0] + numArr[1] - numArr[2];
    sb.append(charArr[0]).append(charArr[1]);
    int n1 = Integer.parseInt(sb.toString());
    int n2 = Integer.parseInt(charArr[2]);
    int charResult = n1 - n2;

    System.out.println(numResult);
    System.out.println(charResult);
  }
}