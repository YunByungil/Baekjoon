package _바킹독_알고리즘.이분탐색.나무_자르기_2805;

import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static long max;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        max++;

        binarySearch(m);
    }

    public static void binarySearch(int num) {
        long start = 0;
        long end = max;

        while (start < end) {
            long count = 0;
            long mid = (start + end) / 2;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    count += arr[i] - mid;
                }
            }

            if (count == num) {
                start = mid + 1;
            } else if (count > num) {
                start = mid + 1;
            } else if (count < num) {
                end = mid;
            }
        }

        System.out.println(start - 1);
    }
}

