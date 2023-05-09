package _바킹독_알고리즘.재귀.Z_1074;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken()); // 행
        int c = Integer.parseInt(st.nextToken()); // 열

        int answer = func(n, r, c);
        System.out.println(answer);

    }

    public static int func(int n, int r, int c) {
        System.out.println(n);
        if (n == 0) {
            return 0;
        }

        int half = 1 << (n - 1);
        System.out.println("half: " + half);
        if (r < half && c < half) {
            System.out.println("111111");
            return func(n - 1, r, c);
        }
        if (r < half && c >= half) {
            return half * half + func(n - 1, r, c - half);
        }
        if (r >= half && c < half) {
            return 2 * half * half + func(n - 1, r - half, c);
        }
        System.out.println("11111");

        return 3 * half * half + func(n - 1, r - half, c - half);
    }










}
