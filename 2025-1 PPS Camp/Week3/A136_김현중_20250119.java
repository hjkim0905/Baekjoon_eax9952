//Baekjoon 1543

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String word = br.readLine();
        int count = 0;
        int index = 0;
        while(index <= str.length() - word.length()){
            if(str.substring(index, index + word.length()).equals(word)){
                count++;
                index += word.length();
            }
            else{
                index++;
            }
        }
        System.out.println(count);
    }
}