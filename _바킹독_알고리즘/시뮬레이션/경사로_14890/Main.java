package _바킹독_알고리즘.시뮬레이션.경사로_14890;

import java.util.*;
import java.io.*;

public class Main {
    public static int n, l;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        arr = new int[2 * n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) { // 가로만 체크하기 위해서 90도 회전 후 밑에 더 담음
            for (int j = 0; j < n; j++) {
                arr[i + n][j] = arr[j][i];
            }
        }
        int count = 0;
        int answer = 0;
        int i = 0;
        int j = 0;
        int num = 0;
        for (i = 0; i < 2 * n; i++) {
            num = 0;
            count = 1;
            for (j = 0; j < n - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    num = j;
                    num++;
                    count++;
                } else if (arr[i][j] + 1 == arr[i][j + 1] && count >= l) {
                    num = j;
                    num++;
                    count = 1;
                } else if (arr[i][j] - 1 == arr[i][j + 1] && count >= 0) {
                    num = j;
                    num++;
                    count = 1 - l;
                } else {
                    num = j;

                    break;
                }
            }
            System.out.println("j = " + j);
            if (j == (n - 1) && count >= 0) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}
