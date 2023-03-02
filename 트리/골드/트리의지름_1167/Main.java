package 트리.골드.트리의지름_1167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Edge {
        int m, dis;

        public Edge(int m, int dis) {
            this.m = m;
            this.dis = dis;
        }
    }

    public static int v, answer, max;
    public static boolean[] visit;
    public static List<Edge>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());

        visit = new boolean[v + 1];
        list = new ArrayList[v + 1];

        for (int i = 0; i <= v; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < v; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            while (true) {
                int a = Integer.parseInt(st.nextToken());

                if (a == -1) {
                    break;
                }

                int b = Integer.parseInt(st.nextToken());

                list[num].add(new Edge(a, b));
            }
        }


        bfs(1, 0);
        visit = new boolean[v + 1];
        bfs(max, 0);

        System.out.println("answer = " + answer);
    }

    public static void bfs(int start, int dis) {
        if (answer < dis) {
            answer = dis;
            max = start;
        }

        visit[start] = true;

        for (Edge edges : list[start]) {
            if (!visit[edges.m]) {
                bfs(edges.m, edges.dis + dis);
            }
        }





    }
}
