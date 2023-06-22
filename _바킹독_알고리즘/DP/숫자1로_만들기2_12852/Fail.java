package _바킹독_알고리즘.DP.숫자1로_만들기2_12852;

import java.util.*;
import java.io.*;

public class Fail {
    public static int n;
    public static int min = Integer.MAX_VALUE;
    public static int[] dp, pre;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        pre = new int[n + 1];

        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            pre[i] = i - 1;
            if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
                dp[i] = dp[i / 3] + 1;
                pre[i] = i / 3;
            }
            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
                dp[i] = dp[i / 2] + 1;
                pre[i] = i / 2;
            }
        }

        System.out.println(dp[n]);

        for (int i : pre) {
            System.out.println("i = " + i);
        }
        System.out.println("===================");

        while (n > 0) {
            System.out.print(n + " ");
            n = pre[n];
        }

    }
}
