package _바킹독_알고리즘.수학.에라토스테네스의_체_2960;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if (arr[j] == 0) {
                    continue;
                }
                arr[j] = 0;
                count++;
                if (k == count) {
                    System.out.println(j);
                }
            }
        }
    }
}
