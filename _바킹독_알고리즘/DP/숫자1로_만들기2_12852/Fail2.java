package _바킹독_알고리즘.DP.숫자1로_만들기2_12852;

import java.util.*;
import java.io.*;

public class Fail2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            arr[i] = i - 1;

            if (i % 2 == 0) {
                if (dp[i / 2] + 1 < dp[i]) {
                    dp[i] = dp[i / 2] + 1;
                    arr[i] = i / 2;
                }
            }

            if (i % 3 == 0) {
                if (dp[i / 3] + 1 < dp[i]) {
                    dp[i] = dp[i / 3] + 1;
                    arr[i] = i / 3;
                }
            }
        }

        System.out.println(dp[n]);

        while (n > 0) {
            System.out.print(n + " ");
            n = arr[n];
        }

    }
}

