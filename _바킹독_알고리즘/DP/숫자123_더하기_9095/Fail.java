package _바킹독_알고리즘.DP.숫자123_더하기_9095;

import java.util.*;
import java.io.*;

public class Fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        for (int k = 0; k < t; k++) {
            int n = Integer.parseInt(br.readLine());

            int[] dp = new int[n + 1];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 3] + dp[i - 2] + dp[i -1];
            }

            System.out.println(dp[n]);
        }

    }
}

