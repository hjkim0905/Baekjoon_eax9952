import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    ArrayList<String> result = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while (true) {
      String line = br.readLine();
      if (line == null || line.isEmpty()) {
        break;
      }
      
      StringTokenizer st = new StringTokenizer(line);
      int[] arr = new int[3];
      
      for (int i = 0; i < 3; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
      }
      
      Arrays.sort(arr);
      
      if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
        break;
      } else {
        if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
          result.add("right");
        } else {
          result.add("wrong");
        }
      }
    }
    
    for (String s : result) {
      System.out.println(s);
    }
  }
}