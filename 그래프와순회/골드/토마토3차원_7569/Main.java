package 그래프와순회.골드.토마토3차원_7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, h;
    public static int lastY, lastX;
    public static int[][] arr;
    public static boolean[][] visit;

    public static int[] col = {-1, 1, 0, 0};
    public static int[] row = {0, 0, -1, 1};
    public static int[] vertical;

    public static int[] check;

    public static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        int checkN = n;
        vertical = new int[]{n, -n};

        n *= h;

        arr = new int[n][m];

        check = new int[n];
        int count = 1;

        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            if (i == checkN) {
                for (int start = i; start < n; start++) {
                    check[start] = count;
                }
                count++;
                checkN += checkN;
            }

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        bfs();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[lastY][lastX] = 0;
                }
            }
        }
        System.out.println((arr[lastY][lastX] - 1));





    }

    public static void bfs() {
        int[] nowLocation;
        while (!q.isEmpty()) {
            nowLocation = q.poll();
            int y = nowLocation[0];
            int x = nowLocation[1];
            int ver = nowLocation[0];
            visit[y][x] = true;
            int newH1 = ver + vertical[0];
            int newH2 = ver + vertical[1];



            if (!(newH1 < 0 || newH1 >= n)) {
                if (!visit[newH1][x] && arr[newH1][x] != -1 && arr[newH1][x] == 0) {
                    arr[newH1][x] = arr[y][x] + 1;
                    visit[newH1][x] = true;
                    q.offer(new int[]{newH1, x});
                }
            }
            if (!(newH2 < 0 || newH2 >= n)) {
                if (!visit[newH2][x] && arr[newH2][x] != -1 && arr[newH2][x] == 0) {
                    arr[newH2][x] = arr[y][x] + 1;
                    visit[newH2][x] = true;
                    q.offer(new int[]{newH2, x});
                }
            }


            for (int i = 0; i < 4; i++) {
                int newY = y + row[i];
                int newX = x + col[i];

                if (newY < 0 || newX < 0 || newY >= n || newX >= m || check[y] != check[newY]) {
                    continue;
                }

                if (visit[newY][newX] || arr[newY][newX] == -1 || arr[newY][newX] == 1) {
                    continue;
                }
                q.offer(new int[]{newY, newX});
                arr[newY][newX] = arr[y][x] + 1;
                visit[newY][newX] = true;

            }
            lastY = y;
            lastX = x;

        }
    }
}
