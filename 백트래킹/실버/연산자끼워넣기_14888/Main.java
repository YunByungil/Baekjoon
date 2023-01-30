package 백트래킹.실버.연산자끼워넣기_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int[] math;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        n개의 수, n - 1개의 연산자
         */
        int n = Integer.parseInt(br.readLine()); // n개의 수
        arr = new int[n];
        math = new int[n - 1];
        visit = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine()); // n개의 수를 배열에 담기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        st = new StringTokenizer(br.readLine()); // n - 1개의 연산자
        // n - 1개 연산자 +, -, x, / 순으로
        for (int i = 0; i < n - 1; i++) {
            math[i] = Integer.parseInt(st.nextToken());
        }

    }

    public static void dfs(int n, int depth) {
        if (depth == n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(n, depth + 1);
            }
        }
    }
}
