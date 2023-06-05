package _바킹독_알고리즘.시뮬레이션.연구소_14502;

import java.util.*;
import java.io.*;

public class ReMain2 {
    public static int n, m;
    public static int max = Integer.MIN_VALUE;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static int[][] arr;
    public static int[][] map;
    public static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);
        System.out.println(max);

    }

    public static void dfs(int depth) {
        if (depth == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    dfs(depth + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void bfs() {
        findVirus();
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = arr[i].clone();
        }

        while (!q.isEmpty()) {
            int[] location = q.poll();
            int nowX = location[0];
            int nowY = location[1];

            for (int i = 0; i < 4; i++) {
                int newX = nowX + dx[i];
                int newY = nowY + dy[i];

                if (newX < 0 || newX >= n || newY < 0|| newY >= m) {
                    continue;
                }

                if (map[newX][newY] == 0) {
                    map[newX][newY] = 2;
                    q.offer(new int[]{newX, newY});
                }
            }
        }

        getMax();


    }

    public static void findVirus() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }
    }

    public static void getMax() {
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    result++;
                }
            }
        }

        max = Math.max(max, result);
    }
}
