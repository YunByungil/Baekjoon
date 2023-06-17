package _바킹독_알고리즘.시뮬레이션.감시_15683;

import java.util.*;
import java.io.*;

public class Fail {
    static class Point {
        int x;
        int y;
        int cctvNum;

        public Point(int x, int y, int cctvNum) {
            this.x = x;
            this.y = y;
            this.cctvNum = cctvNum;
        }
    }
    public static int n, m, count;
    public static int min = Integer.MAX_VALUE;
    // public static int[][] arr;
//    public static int[][] map;
    public static List<Point> cctv = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];



        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (1 <= arr[i][j] && arr[i][j] <= 5) {
                    count++;
                    cctv.add(new Point(i, j, arr[i][j]));
                }
            }
        }
        dfs(0, arr);
        System.out.println(min);


    }

    public static void dfs(int depth, int[][] arr) {

        if (depth == cctv.size()) {
            check(arr);
            return;
        }

        int cctvNum = cctv.get(depth).cctvNum;
        int x = cctv.get(depth).x;
        int y = cctv.get(depth).y;
        int[][] map;

        if (cctvNum == 1) {
            map = copyMap(arr);
            checkLeft(map, x, y);

            dfs(depth + 1, map);

            map = copyMap(arr);
            checkRight(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkUp(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkDown(map, x, y);
            dfs(depth + 1, map);
        } else if (cctvNum == 2) {
            map = copyMap(arr);
            checkLeft(map, x, y);
            checkRight(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkUp(map, x, y);
            checkDown(map, x, y);
            dfs(depth + 1, map);

        } else if (cctvNum == 3) {
            map = copyMap(arr);
            checkUp(map, x, y);
            checkRight(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkRight(map, x, y);
            checkDown(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkLeft(map, x, y);
            checkDown(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkLeft(map, x, y);
            checkUp(map, x, y);
            dfs(depth + 1, map);

        } else if (cctvNum == 4) {
            map = copyMap(arr);
            checkLeft(map, x, y);
            checkUp(map, x, y);
            checkDown(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkUp(map, x, y);
            checkRight(map, x, y);
            checkDown(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkRight(map, x, y);
            checkDown(map, x, y);
            checkLeft(map, x, y);
            dfs(depth + 1, map);

            map = copyMap(arr);
            checkDown(map, x, y);
            checkLeft(map, x, y);
            checkUp(map, x, y);
            dfs(depth + 1, map);

        } else if (cctvNum == 5) {

            map = copyMap(arr);
            checkLeft(map, x, y);
            checkRight(map, x, y);
            checkUp(map, x, y);
            checkDown(map, x, y);
            dfs(depth + 1, map);

        }
    }

    public static void checkLeft(int[][] arr, int x, int y) {
        for (int i = y - 1; i >= 0; i--) {
            if (arr[x][i] == 6) {
                break;
            } else {
                arr[x][i] = 7;
            }

        }
    }

    public static void checkRight(int[][] arr, int x, int y) {
        for (int i = y + 1; i < m; i++) {
            if (arr[x][i] == 6) {
                break;
            } else {
                arr[x][i] = 7;
            }
        }
    }

    public static void checkUp(int[][] arr, int x, int y) {
        for (int i = x - 1; i >= 0; i--) {
            if (arr[i][y] == 6) {
                break;
            } else {
                arr[i][y] = 7;
            }
        }
    }

    public static void checkDown(int[][] arr, int x, int y) {
        for (int i = x + 1; i < n; i++) {
            if (arr[i][y] == 6) {
                break;
            } else {
                arr[i][y] = 7;
            }
        }
    }

    public static int[][] copyMap(int[][] arr) {
        int[][] tmp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp[i][j] = arr[i][j];
            }
        }

        return tmp;
    }


    public static void check(int[][] arr) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    result++;
                }
            }
        }

        min = Math.min(min, result);
    }
}
