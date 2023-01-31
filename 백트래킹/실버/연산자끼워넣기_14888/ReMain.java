package 백트래킹.실버.연산자끼워넣기_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReMain {
    public static int re = 0;
    public static int now = 0;
    public static int max = 0;
    public static int min = Integer.MAX_VALUE;
    public static int[] arr;
    public static int[] result;
    public static int[] math;
    public static char[] base = {'+', '-', '*', '/'};
    public static char[] cal;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        n개의 수, n - 1개의 연산자
         */
        int n = Integer.parseInt(br.readLine()); // n개의 수

        arr = new int[n];
        cal = new char[n - 1];

        visit = new boolean[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine()); // n개의 수를 배열에 담기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // n - 1개의 연산자
        // n - 1개 연산자 +, -, x, / 순으로
        // cal[n - 1]에 연산자를 넣는 과정임
        for (int i = 0; i < 4; i++) {
            int check = Integer.parseInt(st.nextToken());
//            math[i] = check;
            save(i, check);
        }
        dfs(n, arr[0], 1);

        System.out.println(max);
        System.out.println(min);

    }

    public static void dfs(int n, int sum, int depth) {
        if (depth == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (!visit[i]) {
                visit[i] = true;

                int result = calculate(sum, arr[depth], cal[i]);

                dfs(n,result,  depth + 1);
//                re = 0;
                visit[i] = false;
            }
        }
    }

    public static void save(int location, int check) {

        for (int i = 0; i < check; i++) {
            cal[now++] = base[location];
        }
    }

    public static int calculate(int num1, int num2, char cal) {
        int result = 0;
        if (cal == '+') {
            result = num1 + num2;
        } else if (cal == '-') {
            result = num1 - num2;
        } else if (cal == '*') {
            result = num1 * num2;
        } else if (cal == '/') {
            result = num1 / num2;
        }

        return result;
    }

}
