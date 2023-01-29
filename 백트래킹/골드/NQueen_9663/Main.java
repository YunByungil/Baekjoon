package 백트래킹.골드.NQueen_9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int count = 0;
    public static int n = 0;
    public static int[] arr;
    public static boolean[][] visit2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        visit2 = new boolean[n][n];
        dfs(0, 0);
        System.out.println("count = " + count);



    }

    public static void dfs(int now, int depth) {
        System.out.println("depth = " + depth);
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit2[i][j]) {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    System.out.println("========================");
                    check(i, j);
                    dfs(i,depth + 1);
                    visit2[i][j] = false;
                }
            }
        }

    }

    public static void check(int y, int x) {
        // 가로 막기
        for (int i = x; i < n; i++) {
            if (!visit2[y][i]) {
                visit2[y][i] = true;
//                System.out.println("y = " + y);
//                System.out.println("x = " + x);
            }
        }

        // 세로 막기
        for (int i = y; i < n; i++) {
            if (!visit2[i][x]) {
                visit2[i][x] = true;
//                System.out.println("yyyy = " + y);
//                System.out.println("xxxx = " + x);
            }
        }

        // 대각선 막기
        if (x - 1 >= 0 && y + 1 < n) {
            if (!visit2[y + 1][x - 1]) {
                visit2[y + 1][x - 1] = true;
            }
        }

        if (x + 1 < n && y + 1 < n) {
            if (!visit2[y + 1][x + 1]) {
                visit2[y + 1][x + 1] = true;
            }
        }
    }
}
