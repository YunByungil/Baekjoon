package 기본수학1.bronze.no2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apart = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apart[0][i] = i;
            apart[i][1] = 1;
        }

        for (int i = 1; i < apart.length; i++) {
            for (int j = 2; j < apart[i].length; j++) {
                apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
            }
        }

        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());
            sb.append(apart[x][y]).append("\n");
        }
        System.out.println(sb);
    }
}
