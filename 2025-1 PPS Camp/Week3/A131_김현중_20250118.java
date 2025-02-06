// Baekjoon 2108

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Arrays.sort(arr);
        int[] freq = new int[map.size()];
        int idx = 0;

        for (int key : map.keySet()) {
            freq[idx++] = key;
        }

        Arrays.sort(freq);
        int maxFreq = 0;
        int maxFreqNum = 0;

        for (int i = 0; i < freq.length; i++) {
            if (map.get(freq[i]) > maxFreq) {
                maxFreq = map.get(freq[i]);
                maxFreqNum = freq[i];
            }
        }

        int cnt = 0;
        int mode = 0;

        for (int i = 0; i < freq.length; i++) {
            if (map.get(freq[i]) == maxFreq) {
                cnt++;
                mode = freq[i];
            }
            if (cnt == 2) {
                mode = freq[i];
                break;
            }
        }

        System.out.println(Math.round((double) sum / N));
        System.out.println(arr[N / 2]);
        System.out.println(mode);
        System.out.println(max - min);
    }
}