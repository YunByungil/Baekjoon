package 배열2차원.bronze.no2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] a = new int[x][y];
        int[][] b = new int[x][y];

        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
