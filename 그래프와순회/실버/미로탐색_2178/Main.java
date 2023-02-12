package 그래프와순회.실버.미로탐색_2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int finish = 0;
    public static int count = 1;
    public static int n, m; // 도착 위치 (n, m)

    public static int[] newX = {0, 0, 1, -1};
    public static int[] newY = {1, -1, 0, 0};

    public static boolean[][] visit;
    public static int[][] arr; // 미로를 담는 2차원 배열

    public static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            String location = st.nextToken();
            for (int j = 0; j < location.length(); j++) {
                arr[i][j + 1] = location.charAt(j) - '0';
            }
        }
//        q.offer(1);
//        bfs();
        dfs();
        System.out.println("count = " + count);
    }

    public static void dfs() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!visit[i][j] && arr[i][j] == 1) {
                    check(i, j);
                }
            }
        }
    }

    public static void check(int y, int x) {
        if (y == n && x == m) {
            finish = -1;
        }
        visit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int xv = x + newX[i];
            int yv = y + newY[i];

            if (xv < m + 1 && yv < n + 1) {
                if (!visit[yv][xv] && arr[yv][xv] == 1) {
                    System.out.println("yv = " + yv);
                    System.out.println("xv = " + xv);
                    count++;
                    check(yv, xv);
                }
            }
        }
    }

//    public static void bfs() {
//        visit[1][1] = true;
//
//        while (!q.isEmpty()) {
//            int newValue = q.poll();
//            for (int i = 1; i <= n; i++) {
//
//            }
//        }
//    }
}
