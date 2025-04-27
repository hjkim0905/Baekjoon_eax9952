import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder(br.readLine());
    int index = Integer.parseInt(br.readLine());
    
    System.out.println(sb.charAt(index - 1));
  }
}