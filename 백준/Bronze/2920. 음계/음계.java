import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    Integer[] arr = new Integer[8];
    Integer[] compareArr = new Integer[8];
    boolean check = true;

    for (int i = 0; i < 8; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < arr.length; i++) {
      compareArr[i] = arr[i];
    }

    Arrays.sort(compareArr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != compareArr[i]) {
        break;
      }
      else if (i == (arr.length - 1)) {
        System.out.println("ascending");
        check = false;
        break;
      }
    }
    
    Arrays.sort(compareArr, Collections.reverseOrder());
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != compareArr[i]) {
        break;
      } else if (i == (arr.length - 1)) {
        System.out.println("descending");
        check = false;
        break;
      }
    }

    if (check == true)
      System.out.println("mixed");
  }
}