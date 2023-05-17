package _바킹독_알고리즘.시뮬레이션.스티커붙이기_18808;

// "static void main" must be defined in a public class.
import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, k; // 세로: n, 가로: m, 스티커의 개수: k
    public static int y, x; // 스티커의 세로:y, 가로: x
    public static int[][] arr;
    public static int[][] sticker;
    public static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        // arr[0][0] = 1;
        for (int count = 0; count < k; count++) {
            st = new StringTokenizer(br.readLine());
            y = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            sticker = new int[y][x];
            for (int i = 0; i < y; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < x; j++) {
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            findLocation();

        }
        System.out.println(ans);

    }


    public static void findLocation() {
        int r = y;
        int c = x;

        for (int d = 0; d < 4; d++) {
            if (d != 0) {
                sticker = rotate();
            }

            y = sticker.length;
            x = sticker[0].length;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i + y > n || j + x > m) {
                        break;
                    }

                    if (putOn(i, j)) {
                        return;
                    }
                }
            }
        }
    }

    public static boolean putOn(int startY, int startX) {
        for (int i = startY; i < startY + y; i++) {
            for (int j = startX; j < startX + x; j++) {
                if (arr[i][j] == 1 && sticker[i - startY][j - startX] == 1) {
                    return false;
                }
            }
        }

        for (int i = startY; i < startY + y; i++) {
            for (int j = startX; j < startX + x; j++) {
                if (sticker[i - startY][j - startX] == 1) {
                    arr[i][j] = 1;
                    ans++;
                }
            }
        }

        return true;
    }

    public static int[][] rotate() {
        int[][] newSticker = new int[x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                newSticker[j][y - i - 1] = sticker[i][j];
            }
        }
        return newSticker;
    }

}
