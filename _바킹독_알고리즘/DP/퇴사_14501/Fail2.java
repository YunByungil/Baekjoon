package _바킹독_알고리즘.DP.퇴사_14501;

import java.util.*;
import java.io.*;

public class Fail2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n + 1];
        int[] p = new int[n + 1];
        int[] dp = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            if (i + t[i] <= n + 1) {
                dp[i + t[i]] = Math.max(p[i] + dp[i], dp[i + t[i]]);
            }

            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
        }

        int answer = Math.max(dp[n], dp[n + 1]);
        System.out.println(answer);

    }
}

