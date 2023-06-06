package _바킹독_알고리즘.시뮬레이션.사다리_조작_15684;

import java.util.*;
import java.io.*;

public class Fail {
    public static int n, m, h;
    public static int result;
    public static int[][] arr;
    public static int[][] map;
    public static boolean[][] visit;
    public static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        arr = new int[h + 1 + 1][n + 1];
        visit = new boolean[h + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            arr[h + 1][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            // st = new StringTokenizer(br.readLine());
            String str = br.readLine();
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';

            arr[a][b] = b + 1;
            arr[a][b + 1] = b;

            visit[a][b] = true;
            visit[a][b + 1] = true;
            if (b + 2 <= n) {
                visit[a][b + 2] = true;
            }
            if (b - 1 >= 0) {
                visit[a][b - 1] = true;
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(visit[i][j] + " ");
            }

            System.out.println();
        }

        dfs();

    }

    public static void dfs() {
        result = 0;
        for (int i = 1; i <= n; i++) {
            q.offer(new int[]{1, i});
            if (bfs(i)) {
                System.out.println(0);
                System.exit(0);
                // return;
            }
        }

        dfs1(0);
    }

    public static void dfs1(int depth) {
        result = 0;
        boolean next = false;
        if (depth == 1) {
            for (int i = 1; i <= n; i++) {
                q.offer(new int[]{1, i});
                next = bfs(i);
            }

            if (next) {
                System.out.println(1);
                System.exit(0);
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= n; j++) {
                if (!visit[i][j]) {
                    visit[i][j] = true;
                    arr[i][j] = j + 1;
                    arr[i][j + 1] = j;
                    dfs1(depth + 1);
                    visit[i][j] = false;
                    arr[i][j] = 0;
                    arr[i][j + 1] = 0;
                }
            }
        }
    }

    public static void dfs2(int depth) {
        System.out.println("gd");
//         result = 0;
//         if (depth == 2) {
//             for (int i = 1; i <= n; i++) {
//                 q.offer(new int[]{1, i});
//                 if (bfs(i)) {
//                     System.out.println(2);
//                     System.exit(0);

//                 }
//             }
//             return;
//         }

//         for (int i = 1; i <= h; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (!visit[i][j]) {
//                     visit[i][j] = true;
//                     arr[i][j] = j + 1;
//                     arr[i][j + 1] = j;
//                     dfs2(depth + 1);
//                     visit[i][j] = false;
//                     arr[i][j] = 0;
//                     arr[i][j + 1] = 0;
//                 }
//             }
//         }
    }

    public static boolean bfs(int start) {
        // result = 0; // result가 6이 되면 1, 2, 3, 4, 5 다 알맞게 들어간 것이다.
        // int find = start; // 시작 세로선 1, 2, 3, 4, 5 ....
        // q.offer(new int[]{1, 1}); // 시작 좌표 (세로 선 1, 2, 3, 4, 5 ....)
        System.out.println("start = " + start);
        while (!q.isEmpty()) {
            int[] location = q.poll();
            int nowX = location[0];
            int nowY = location[1];

            // System.out.println("nowX = " + nowX);

            if (nowX + 1 > h + 1) {
                if (arr[nowX][nowY] == start) {
                    result++;
                }
                break;
            }

            if (arr[nowX][nowY] == 0) {
                q.offer(new int[]{nowX + 1, nowY});
            } else {
                q.offer(new int[]{nowX + 1, arr[nowX][nowY]});
            }
        }

        if (result == n) {
            return true;
        }
        return false;
    }

}
