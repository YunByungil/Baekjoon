package _바킹독_알고리즘.백트래킹.N과M8_15657;

// "static void main" must be defined in a public class.
import java.util.*;
import java.io.*;

public class Main {
    public static int n, m; // n 개의 자연수 중 m개를 고른 수열
    public static int[] arr;
    public static int[] numArr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        numArr = new int[n];
        visit = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);
        dfs(0, 0);

        System.out.println(sb);
    }

    public static void dfs(int depth, int start) {
        if (depth == m) {
            for (int i = 0 ; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = start; i < n; i++) {
            if (!visit[i]) {
                // visit[i] = true;
                arr[depth] = numArr[i];
                dfs(depth + 1, i);
                // visit[i] = false;
            }
        }
    }
}
