package DP.플래티넘.전구_2449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 전구 n개
        int k = Integer.parseInt(st.nextToken()); // 표현할 수 있는 색 k

        int[] a = new int[n + 1];
        int[][] dp = new int[n + 1][n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if (a[i] == a[i - 1]) {
                i--;
                n--;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
            dp[i][i] = 0;
        }

        // 식을 이용해서 dp의 값을 채워넣으면 된다.

        for (int size = 2; size <= n; size++) {
            for (int start = 1; start <= n - size + 1; start++) {
                int end = size + start - 1;
                for (int mid = start; mid < end; mid++) {
                    int newValue = dp[start][mid] + dp[mid + 1][end];
                    if (a[start] != a[mid + 1]) {
                        newValue++;
                    }

                    if (dp[start][end] > newValue) {
                        dp[start][end] = newValue;
                    }
                }
            }
        }




        System.out.println("dp[1][5] = " + dp[1][n]);


    }
}
