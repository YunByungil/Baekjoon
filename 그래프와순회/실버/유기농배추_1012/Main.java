package 그래프와순회.실버.유기농배추_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int m, n;
    public static int count;
    public static boolean[][] visited;
    public static boolean[][] dp, dp2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 t

        for (int check = 0; check < t; check++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 배추밭의 가로 길이
            n = Integer.parseInt(st.nextToken()); // 배추밭의 세로 길이
            int k = Integer.parseInt(st.nextToken()); // 배추가 심어져있는 위치의 개수
            count = 0;


            visited = new boolean[n][m];
            dp = new boolean[n][m];
            dp2 = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                dp[b][a] = true;
                dp2[b][a] = true;
            }

            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++) {
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }
            dfs(0, 0);
            System.out.println("-----------------");
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++) {
                    System.out.print(dp2[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++) {
                    if (dp2[i][j]) {
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }

    public static void dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n) {
            return;
        }

        if (visited[y][x]) {
            return;
        }

        if (!visited[y][x]) {
            visited[y][x] = true;
        }
        if (x == 2 && y == 2) {
            System.out.println("why = " + dp[y][x]);
        }
        if (dp[y][x] && !visited[y][x]) {
            dp[y][x] = false;
            dfs2(x - 1, y);
            dfs2(x, y - 1);
            dfs2(x + 1, y);
            dfs2(x, y + 1);
        }
        System.out.println("gd");

        dfs(x - 1, y);
        dfs(x, y - 1);
        dfs(x + 1, y);
        dfs(x, y + 1);
    }

    public static void dfs2(int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n) {
            return;
        }
        if (visited[y][x]) {
            return;
        }
        dp[y][x] = false;
        System.out.println("dp[" + y + "][" + x + "] = " + dp[y][x]);
        dp2[y][x] = false;
    }
}
