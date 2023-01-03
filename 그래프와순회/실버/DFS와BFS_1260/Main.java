package 그래프와순회.실버.DFS와BFS_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] arr;
    public static boolean[][] dp;

    public static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // DFS는 한 곳만 죽어라 파는 느낌이고
        // BFS는 여러개를 골고루 파는 느낌이다.

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 개수 n
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수 m
        int v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 번호 v

        // 2차원 배열을 생각하면 된다. ( 그래프 )
        arr = new boolean[n + 1];

        dp = new boolean[n + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dp[a][b] = dp[b][a] = true;
        }
        dfs(v);
        System.out.println();
        arr = new boolean[n + 1];
        bfs(v);


    }

    public static void dfs(int v) {
        if (arr[v]) {
            return;
        }
        arr[v] = true;
        System.out.print(v + " ");

        for (int i = v; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (!arr[j] && dp[v][j]) {
                    dfs(j);
                }
            }
        }
    }

    public static void bfs(int v) {
        list = new ArrayList<>();
        arr[v] = true;
        list.add(v);

        while (!list.isEmpty()) {
            int idx = list.remove(0);
            System.out.print(idx + " ");
            for (int i = 1; i < arr.length; i++)
                if (!arr[i] && dp[idx][i]) {
                    arr[i] = true;
                    list.add(i);
                }
        }
    }
}
