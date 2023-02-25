package 트리.실버.트리의부모찾기_11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[] p;
    public static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        p = new int[n + 1];
        
        list.add(new ArrayList<>());
        for (int i = 1; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        dfs(1);

        for (int i = 2; i < p.length; i++) {
            if (p[i] > 0)
            System.out.println(p[i]);
        }
    }

    public static void dfs(int index) {
        for (int i : list.get(index)) {
            if (p[i] == 0) {
                p[i] = index;
                dfs(i);
            }
        }
    }
}
