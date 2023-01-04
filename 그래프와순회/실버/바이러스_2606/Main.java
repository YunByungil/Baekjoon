package 그래프와순회.실버.바이러스_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] visited;
    public static boolean[][] dp;

    public static int n, m, count;

    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        // 100대 이하이기 때문에 dfs 접근하자.
        visited = new boolean[n + 1];
        dp = new boolean[n + 1][n + 1];

        m = Integer.parseInt(br.readLine()); // 직접 연결되어있는 컴퓨터의 쌍의 수
        StringTokenizer st;
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            dp[a][b] = true;
            dp[b][a] = true;
        }

        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int num) {
        visited[num] = true;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && dp[num][i]) {
                count++;
                dfs(i);
            }
        }
    }
}
