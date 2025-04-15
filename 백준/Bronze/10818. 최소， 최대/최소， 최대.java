import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      min = Math.min(min, num);
      max = Math.max(max, num);
    }
    
    System.out.printf("%d %d\n", min, max);
  }
}