package 트리.골드.트리의지름_1167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReMain2 {

    public static class Edge {
        int location;
        int distance;

        public Edge(int location, int distance) {
            this.location = location;
            this.distance = distance;
        }
    }

    public static int v, max, answer;
    public static boolean[] visit;
    public static List<List<Edge>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());

        visit = new boolean[v + 1];

        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < v; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            while (true) {
                int b = Integer.parseInt(st.nextToken());

                if (b == -1) {
                    break;
                }

                int c = Integer.parseInt(st.nextToken());

                list.get(a).add(new Edge(b, c));
            }
        }
        dfs(1, 0);
        visit = new boolean[v + 1];
        dfs(max, 0);

        System.out.println(answer);

    }

    public static void dfs(int start, int dis) {
        visit[start] = true;
        if (answer < dis) {
            answer = dis;
            max = start;
        }

        for (Edge edge : list.get(start)) {
            if (!visit[edge.location]) {
                dfs(edge.location, edge.distance + dis);
            }
        }
    }
}
