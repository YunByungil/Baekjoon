package 재귀.silver.no11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reMain {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = (int) (Math.pow(2, n)) - 1;
        System.out.println(result);
        hanoi(n, 1, 2, 3);

    }

    static void hanoi(int n, int start, int mid, int end) {
        // 종료 조건
        if (n == 1) {
            System.out.println(start + " " + end);
            return;
        }
        // 수행 조건
        hanoi(n - 1, start, end, mid);
        System.out.println(start + " " + end);
        hanoi(n - 1, mid, start, end);
    }
}
