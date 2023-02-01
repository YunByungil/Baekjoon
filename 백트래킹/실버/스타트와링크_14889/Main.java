package 백트래킹.실버.스타트와링크_14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int num1 = 0;
    public static int num2 = 0;
    public static int[] temp;
    public static int[] temp2;
    public static int[][] arr;
    public static boolean[][] visit;
    public static boolean[]visit2;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 축구하러 모인 사람 n, 짝수

        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];
        visit2 = new boolean[n + 1];
        temp = new int[n / 2];
        temp2 = new int[n / 2];
        // 1. 번호는 1부터 N까지로 배정, 능력치를 조사 2차원 배열 채우기
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <=n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // (1, 1) (2, 2)...... (n, n)은 0값이다.
        for (int i = 1; i <= n; i++) {
            visit[i][i] = true;
        }
        dfs(n, 0);
        System.out.println("min = " + min);


    }

    public static void dfs(int n, int depth) {
//        System.out.println("depth = " + depth);
        if (depth == n / 2) {
            for (int i = 0; i < depth; i++) {
                System.out.println("result: " + temp[i]);
            }
            int check = Math.abs(temp[0] - temp[1]);
            min = Math.min(min, check);
            return;
        }

        for (int i = 1; i <= n; i++) {
//            System.out.println("이 i값이 중요함 = " + i);
            if (visit2[i]) continue;
            for (int j = 1; j <= n; j++) {
                if (visit2[j]) continue;
                if (!visit[i][j]) {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    System.out.println("==============");
                    temp[depth] += arr[i][j] + arr[j][i];
                    visit2[i] = true;
                    visit2[j] = true;

                    dfs(n, depth + 1);
                    temp[depth] = 0;
                    visit2[i] = false;
                    visit2[j] = false;
                }
            }
        }
    }
}
