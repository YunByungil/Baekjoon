package b전체문제.골드.LCA_11437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReMain {
    public static int n, m;
    public static boolean[] visit;
    public static int[] parent;
    public static int[] d;
    public static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        n = Integer.parseInt(br.readLine());
        parent = new int[n + 1];
        visit = new boolean[n + 1];
        d = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
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

    /**
     * 부모 노드, depth를 계산
     */
    public static void dfs(int start, int depth) {
        visit[start] = true;
        d[start] = depth;

        for (Integer next : list.get(start)) {
            if (!visit[next]) {
                parent[next] = start;
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

        System.out.println(b);
    }
}
