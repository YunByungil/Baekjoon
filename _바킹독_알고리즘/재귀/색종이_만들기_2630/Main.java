package _바킹독_알고리즘.재귀.색종이_만들기_2630;

// "static void main" must be defined in a public class.
import java.io.*;
import java.util.*;

public class Main {
    public static int n; // 종이의 크기
    public static int zero, one;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        func(0, 0, n);
        System.out.println(zero);
        System.out.println(one);
    }

    public static void func(int y, int x, int n) {
        if (n == 0) {
            return;
        }

        if (check(y, x, n)) {
            if (arr[y][x] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }
        int half = n / 2;

        func(y, x, half); // 제 2사분면
        func(y, x + half, half); // 제 1사분면
        func(y + half, x, half); // 제 3사분면
        func(y + half, x + half, half); // 제 4사분면
        System.out.println("half: " + half);



    }

    public static boolean check(int y, int x, int size) {
        int color = arr[y][x];
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }

        return true;

    }

}
