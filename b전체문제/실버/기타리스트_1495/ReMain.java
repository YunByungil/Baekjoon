package b전체문제.실버.기타리스트_1495;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReMain {
    public static int n, s, m;
    public static int[] v;
    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        v = new int[n + 1];
        dp = new int[m + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <= m; i++) {
            dp[i] = -1;
        }

        dp[s] = 0;

        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= m; j++) {
                if (dp[j] == i - 1) {
                    int plus = j + v[i];
                    int minus = j - v[i];

                    if (0 <= plus && plus <= m) {
                        list.add(plus);
                    }

                    if (0 <= minus && minus <= m) {
                        list.add(minus);
                    }

                }
            }

            for (Integer value : list) {
                dp[value] = i;
            }
        }

        int max = -1;

        for (int i = 0; i <= m; i++) {
            if (dp[i] == n) {
                max = Math.max(max, i);
            }
        }

        System.out.println(max);
    }
}
