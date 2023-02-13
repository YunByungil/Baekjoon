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

    public static int[] col = {0, 0, 1, -1};
    public static int[] row = {1, -1, 0, 0};

    public static boolean[][] visit;
    public static int[][] arr; // 미로를 담는 2차원 배열

    public static Queue<spot> q = new LinkedList<>();

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
        visit[1][1] = true;
        bfs(1, 1);
        System.out.println("arr[n][m] = " + arr[n][m]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(int x, int y) {
        q.add(new spot(x, y));

        while (!q.isEmpty()) {
            spot s = q.poll();

            for (int i = 0; i < 4; i++) {
                int newX = s.x + col[i];
                int newY = s.y + row[i];
                if (newX > m || newY > n) {
                    continue;
                }

                if (visit[newY][newX] || arr[newY][newX] == 0) {
                    continue;
                }
                System.out.println("newX = " + newX);
                System.out.println("newY = " + newY);
                System.out.println("=");

                q.add(new spot(newX, newY));
                visit[newY][newX] = true;
                arr[newY][newX] = arr[s.y][s.x] + 1;
            }
        }
    }

    public static class spot {
        int x;
        int y;

        public spot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
