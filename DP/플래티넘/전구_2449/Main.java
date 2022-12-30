package DP.플래티넘.전구_2449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;
    public static int[] arr;
    public static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 전구의 개수
        int k = Integer.parseInt(st.nextToken()); // 전구가 표현할 수 있는 색의 개수
        arr = new int[n + 1]; // 전구들 배열
        int[][] dp = new int[n + 1][n + 1];

        st = new StringTokenizer(br.readLine());
        // 1. 입력 받으면서 중복된 숫자를 제거
        for (int i = 1; i <= n; i++) { // 입력 받으면서 중복된 숫자를 제거
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == arr[i - 1]) {
                n--;
                i--;
            }
        }

        // 2. dp 배열 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
            dp[i][i] = 0;
        }

        // 3. 전구 최솟값 구하기
        /*
        [1, 1] [2, 2] [3, 3] [4, 4] [5, 5]
        0 0 0 0 0
         */

        /*
        [1, 2] [2, 3] [3, 4] [4, 5]
        - [1, 1] + [2, 2] + a[1] vs a[2]
        0 + 0 + 1
        - [2, 2] + [3, 3] + a[2] vs a[3]
        0 + 0 + 1
        - [3, 3] + [4, 4] + a[3] vs a[4]
        0 + 0 + 1
        - [4, 4] + [5, 5] + a[4] vs a[5]
        0 + 0 + 1
         */

        // start : 1 ~ 4
        // mid : 1 ~ 4, mid + 1 : 2 ~ 5
        // end : 2 ~ 5 => size == 2일 때 2, size == 3일 때, 3
        // end => size가 2일 때 1개 더 큼, size가 3일 때 2개 더 큼
        // end = start + size - 1
        // 1 + 2, 2 + 2, 3 + 2, 4 + 2,

        /*
        [1, 2] [2, 3] [3, 4] [4, 5]
        1 1 1 1
         */
        /*
        [1, 3] [2, 4] [3, 5]
        - [1, 1] + [2, 3] + a[1] vs a[2]
        0 + 1 + 1
        - [1, 2] + [3, 3] + a[1] vs a[3]
        1 + 0 + 1
        - [2, 2] + [3, 4] + a[2] vs a[3]
        0 + 1 + 1
        - [2, 3] + [4, 4] + a[2] vs a[4]
        1 + 0 + 0
        - [3, 3] + [4, 5] + a[3] vs a[4]
        0 + 1 + 1
        - [3, 4] + [5, 5] + a[3] vs a[5]
        1 + 0 + 1
         */

        /*
        [1, 3] [2, 4] [3, 5]
        2 1 2
         */

        /*
        [1, 4] [2, 5]
        - [1, 1] + [2, 4] + a[1] vs a[2]
        0 + 1 + 1
        - [1, 2] + [3, 4] + a[1] vs a[3]
        1 + 1 + 1
        - [1, 3] + [4, 4] + a[1] vs a[4]
        2 + 0 + 1

        - [2, 2] + [3, 5] + a[2] vs a[3]
        0 + 2 + 1
        - [2, 3] + [4, 5] + a[2] vs a[4]
        1 + 1 + 0
        - [2, 4] + [5, 5] + a[2] vs a[5]
        1 + 0 + 1
         */

        /*
        [1, 4] [2, 5]
        2 2
         */

        /*
        [1, 5] == 최종값
        [1, 1] + [2, 5] + a[1] vs a[2]
        [1, 2] + [3, 5] + a[1] vs a[3]
        [1, 3] + [4, 5] + a[1] vs a[4]
        [1, 4] + [5, 5] + a[1] vs a[5]
         */
        /*
        size = 2
        start = 1 ~ 4
        end = 2, 3, 4, 5
        mid = 1~1, 1~2, 1~3, 1~4
         */
        for (int size = 2; size <= n; size++) {
            for (int start = 1; start <= n - size + 1; start++) {
                int end = size + start - 1;
                for (int mid = start; mid < end; mid++) {
                    int newValue = dp[start][mid] + dp[mid + 1][end];
                    if (arr[start] != arr[mid + 1]) {
                        newValue++;
                    }
                    if (dp[start][end] > newValue) {
                        dp[start][end] = newValue;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("result : " + dp[1][n]);

    }
}
