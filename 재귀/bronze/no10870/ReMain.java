package 재귀.bronze.no10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // Fn = Fn-1 + Fn-2
        int result = dfs(n);

        System.out.println(result);
    }

    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }

        return dfs(n - 1) + dfs(n - 2);
    }
}
