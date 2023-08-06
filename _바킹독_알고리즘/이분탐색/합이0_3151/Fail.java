package _바킹독_알고리즘.이분탐색.합이0_3151;

import java.util.*;
import java.io.*;

public class Fail {
    public static int n;
    public static long answer = 0;
    public static int[] arr, sorted;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        sorted = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int start = j + 1;
                int end = n;
                int sum = -(arr[i] + arr[j]);

                int low = lowerBound(start, end, sum);

                if (low == n || arr[low] != sum) {
                    continue;
                }

                int up = upperBound(start, end, sum);
                answer += up - low;

            }
        }

        System.out.println(answer);
    }

    public static int lowerBound(int start, int end, int num) {
        int mid;
        while (start < end) {
            mid = (start + end) / 2;

            if (arr[mid] == num) {
                end = mid;
            } else if (arr[mid] > num) {
                end = mid;
            } else if (arr[mid] < num) {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int upperBound(int start, int end, int num) {
        int mid;
        while (start < end) {
            mid = (start + end) / 2;

            if (arr[mid] == num) {
                start = mid + 1;
            } else if (arr[mid] > num) {
                end = mid;
            } else if (arr[mid] < num) {
                start = mid + 1;
            }
        }

        return start;
    }
}
