package _바킹독_알고리즘.투포인터.소수의_연속합_1644;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i + i; j <= n; j += i) {
                if (arr[j] == 0) {
                    continue;
                }
                arr[j] = 0;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        int size = list.size();
        int answer = 0;
        int sum = list.get(0);
        int end = 0;

        for (int start = 0; start < size; start++) {
            while (end < size && sum < n) {
                end++;
                if (end != size) {
                    sum += list.get(end);
                }
            }

            if (sum == n) {
                answer++;
            }

            sum -= list.get(start);
        }

        System.out.println(answer);
    }
}
