package _바킹독_알고리즘.DP.피보나치_함수_1003;

import java.io.*;

public class Fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[41][2];

        dp[0][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(dp[num][0] + " " + dp[num][1]);
        }
    }
}
