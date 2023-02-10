package 백트래킹.실버.스타트와링크_14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReMain2 {
    public static int n;
    public static int min = Integer.MAX_VALUE;
    public static int[][] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1, 0);

        System.out.println("min = " + min);

    }

    public static void dfs(int now, int depth) {
        if (depth == n / 2) {
            check();
            return;
        }

        for (int i = now; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }

    public static void check() {
        int start = 0;
        int end = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (visit[i] && visit[j]) {
                    start += (arr[i][j] + arr[j][i]);
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                }

                if (!visit[i] && !visit[j]) {
                    end += (arr[i][j] + arr[j][i]);
                }
            }
        }
        int value = Math.abs(start - end);
        min = Math.min(min, value);
    }
}
