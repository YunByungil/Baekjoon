package _바킹독_알고리즘.시뮬레이션.드래곤_커브_15685;

import java.util.*;
import java.io.*;

public class Answer {
    public static int n;
    public static int x, y, d, g;
    public static int[] curve = {1, 2, 3, 0};
    public static int[][] delta = {
            {0, 1}, {-1, 0}, {0, -1}, {1, 0}
    };
    public static boolean[][] map = new boolean[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        n = Integer.parseInt(br.readLine());

        for (int k = 0; k < n; k++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());

            makeCurve(x, y, d, g);
        }

        int answer = 0;

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (map[i][j] && map[i][j + 1] && map[i + 1][j] && map[i + 1][j + 1]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static void makeCurve(int x, int y, int d, int g) {
        map[y][x] = true;

        int endR = y + delta[d][0];
        int endC = x + delta[d][1];
        int endD = curve[d];

        List<Point> list = new ArrayList<>();
        list.add(new Point(endR, endC, endD));

        for (int i = 0; i < g; i++) {
            for (int j = list.size() - 1; j >= 0; j--) {
                Point p = list.get(j);
                endR += delta[p.d][0];
                endC += delta[p.d][1];
                endD = curve[p.d];

                list.add(new Point(endR, endC, endD));
            }
        }
    }

    static class Point {
        int r, c, d;

        public Point(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;

            map[r][c] = true;
        }
    }

}
