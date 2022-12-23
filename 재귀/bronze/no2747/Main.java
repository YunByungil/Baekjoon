package 재귀.bronze.no2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = dfs(n);
        System.out.println(result);
    }

    public static int dfs(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n, dfs(n - 1) + dfs(n - 2));
        return dfs(n - 1) + dfs(n - 2);
    }
}
