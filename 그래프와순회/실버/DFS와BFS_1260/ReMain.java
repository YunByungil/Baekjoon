package 그래프와순회.실버.DFS와BFS_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReMain {
    public static int n, m, v;
    public static boolean[] visited;
    public static boolean[][] dp;
    public static List<Integer> q;
    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 정점의 개수
        m = Integer.parseInt(st.nextToken()); // 간선의 개수
        v = Integer.parseInt(st.nextToken()); // 시작 번호

        visited = new boolean[n + 1];
        dp = new boolean[n + 1][n + 1];


        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            dp[a][b] = true;
            dp[b][a] = true;
        }

        dfs(v);
        System.out.println();

        bfs();

    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && dp[v][i]) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        q = new ArrayList<>();
        visited = new boolean[n + 1];

        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int idx = q.remove(0);
            System.out.print(idx + " ");

            for (int i = 1; i <= n; i++) {
                if (!visited[i] && dp[idx][i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
