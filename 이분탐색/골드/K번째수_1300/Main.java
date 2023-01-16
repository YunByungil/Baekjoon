package 이분탐색.골드.K번째수_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 배열의 크기 n
        int k = Integer.parseInt(br.readLine()); // k
        int count = 1;
        int[][] a = new int[n + 1][n + 1];
        int[] b = new int[(n * n) + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = i * j;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                b[count++] = a[i][j];
            }
        }
        Arrays.sort(b);
        System.out.println(b[k]);
    }
}
