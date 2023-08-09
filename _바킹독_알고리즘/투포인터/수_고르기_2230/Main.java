package _바킹독_알고리즘.투포인터.수_고르기_2230;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int answer = Integer.MAX_VALUE;
        int end = 0;

        for (int start = 0; start < n; start++) {
            while (end < n && arr[end] - arr[start] < m) {
                end++;
            }

            if (end == n) {
                break;
            }

            answer = Math.min(answer, arr[end] - arr[start]);
        }

        System.out.println(answer);
    }
}
