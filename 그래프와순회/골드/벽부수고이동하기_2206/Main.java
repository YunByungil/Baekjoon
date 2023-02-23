package 그래프와순회.골드.벽부수고이동하기_2206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int hammer, result;
    public static int n, m;

    public static int[][] arr;
    public static boolean[][] visit;

    public static int[] col = {1, -1, 0, 0};
    public static int[] row = {0, 0, 1, -1};

    public static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
        0은 이동할 수 있고, 1은 이동할 수 없다
        (1, 1)에서 (N, M)의 위치까지 이동, 최단경로
         */

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 1; j <= m; j++) {
                arr[i][j] = str.charAt(j - 1) - '0';
            }
        }

        bfs();
        resultMap();





    }

    public static void bfs() {
        arr[1][1] = 1;
        visit[1][1] = true;
        q.offer(new int[]{1, 1});

        while (!q.isEmpty()) {
            int[] nowLocation = q.poll();
            int y = nowLocation[0];
            int x = nowLocation[1];

            for (int i = 0; i < 4; i++) {
                int newY = y + row[i];
                int newX = x + col[i];


                if (newY <= 0 || newX <= 0 || newY > n || newX > m) {
                    continue;
                }

                if (hammer == 0 && arr[newY][newX] == 1 && !visit[newY][newX]) {
                    System.out.println("newY = " + newY);
                    System.out.println("newX = " + newX);
                    System.out.println("===");
                    hammer++;
                    arr[newY][newX] = arr[y][x] + 1;
                }

                if (visit[newY][newX] || arr[newY][newX] == 1) {
                    continue;
                }

                q.offer(new int[]{newY, newX});
                arr[newY][newX] = arr[y][x] + 1;
                visit[newY][newX] = true;
            }
        }
    }











    private static void resultMap() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
