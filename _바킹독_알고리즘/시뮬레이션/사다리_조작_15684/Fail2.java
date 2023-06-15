package _바킹독_알고리즘.시뮬레이션.사다리_조작_15684;

import java.util.*;
import java.io.*;

public class Fail2 {
    public static int n, m, h;
    public static int answer = 4;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new int[h + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
        }

        dfs(0);
        if (answer == 4) {
            answer = -1;
        }
        System.out.println(answer);

    }

    public static void dfs(int depth) {
        if (depth >= answer) {
            return;
        }

        if (check()) {
            answer = depth;
            return;
        }

        if (depth == 3) {
            return;
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0 && arr[i][j - 1] == 0 && arr[i][j + 1] == 0) {
                    arr[i][j] = 1;
                    dfs(depth + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static boolean check() {
        for (int i = 1; i <= n; i++) {
            int pos = i;

            for (int j = 1; j <= h; j++) {
                if (arr[j][pos] == 1) {
                    pos++;
                } else if (arr[j][pos - 1] == 1) {
                    pos--;
                }
            }

            if (pos != i) {
                return false;
            }
        }

        return true;
    }
}

