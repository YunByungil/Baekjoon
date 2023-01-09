package 그래프와순회.실버.단지번호붙이_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int n, count; // n은 지도의 크기, count는 단지 수
    public static int house; // 아파트 내의 집의 수
    public static int[][] arr;
    public static int[][] visited;

    public static List<Integer> list = new ArrayList<>();

    public static int[] col = {0, 0, 1, -1};
    public static int[] row = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정사각형, 1은 집, 0은 집이 없는 곳

        n = Integer.parseInt(br.readLine()); // 지도의 크기
        arr = new int[n][n]; // 정사각형 지도
        visited = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0'; // 지도를 1과 0으로 채움
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 0 && arr[i][j] == 1) {
                    count++;
                    dfs(i, j);
//                    System.out.println("house = " + house);
                    list.add(house);
                    house = 0;
                }
            }
        }
        Collections.sort(list);

        System.out.println(count);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    public static void dfs(int y, int x) {
//        System.out.println("arr[" + y + "][" + x + "]");
        visited[y][x] = 1;
        house++;

        for (int i = 0; i < 4; i++) {
            int newX = x + col[i];
            int newY = y + row[i];
            if (0 <= newX && newX < n && 0 <= newY && newY < n)
                if (visited[newY][newX] == 0 && arr[newY][newX] == 1) {
                    dfs(newY, newX);
                }
        }

    }
}
