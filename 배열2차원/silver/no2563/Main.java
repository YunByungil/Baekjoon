package 배열2차원.silver.no2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 0. input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int ea = Integer.parseInt(br.readLine());
        // 1. 도화지의 총 넓이는 100x100
        int[][] wide = new int[101][101];
        int count = 0;
        while (count < ea) {
            count++;
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (wide[i][j] == 0) {
                        wide[i][j] = 1;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i < wide.length; i++) {
            for (int j = 0; j < wide[i].length; j++) {
                if (wide[i][j] > 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
