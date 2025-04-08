import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String word = st.nextToken();

    //소문자화
    word = word.toLowerCase();
    // 문자열 -> 배열 변환
    char[] arr = word.toCharArray();

    // 알파벳이 문자열에 있는지 확인하기 위한 boolean 값
    boolean isExist = false;

    for (int i = 'a'; i <= 'z'; i++) {
      isExist = false;
      for (int j = 0; j < arr.length; j++) {
        if (i == arr[j]) {
          isExist = true;
          System.out.print(j);
          System.out.print(' ');
          //등장하는 첫번째 위치 기준이니 break 필요!
          break;
        }
      }
      if (isExist != true) System.out.print("-1 ");
    }
    System.out.println();
  }
}