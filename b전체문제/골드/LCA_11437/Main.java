package b전체문제.골드.LCA_11437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static List<List<Integer>> list = new ArrayList<>();
    public static int[] d, parent;
    public static boolean[] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 노드의 개수 n
        d = new int[n + 1];
        parent = new int[n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        StringTokenizer st = null;
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }


        dfs(1, 0);

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            lca(a, b);
        }
    }

    public static void dfs(int x, int depth) {
        d[x] = depth;
        visit[x] = true;

        for (Integer next : list.get(x)) {
            if (!visit[next]) {
                parent[next] = x;
                dfs(next, depth + 1);
            }
        }
    }

    public static void lca(int a, int b) {
        while (d[a] != d[b]) {
            if (d[a] > d[b]) {
                a = parent[a];
            } else {
                b = parent[b];
            }
        }

        while (a != b) {
            a = parent[a];
            b = parent[b];
        }

        System.out.println(a);
    }
}
