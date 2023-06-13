package _바킹독_알고리즘.시뮬레이션.경사로_14890;

import java.util.*;
import java.io.*;

public class ReMain {
    public static int n, l;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        arr = new int[n * 2][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i + n][j] = arr[j][i];
            }
        }

        int answer = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < n * 2; i++) {
            int count = 1;
            for (j = 0; j < n - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    count++;
                } else if (arr[i][j] - 1 == arr[i][j + 1] && count >= 0) {
                    count = 1 - l;
                } else if (arr[i][j] + 1 == arr[i][j + 1] && count >= l) {
                    count = 1;
                } else {
                    break;
                }
            }
            if (j == n - 1 && count >= 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
