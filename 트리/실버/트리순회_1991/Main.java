package 트리.실버.트리순회_1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static List<List<Character>> list = new ArrayList<>();
    public static boolean[] visit;
    public static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new char[n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char skip = st.nextToken().charAt(0);
            int num = skip - '0' - 16;
            char a = st.nextToken().charAt(0);
            char b = st.nextToken().charAt(0);
//                list.get(i).add(a);
//                list.get(i).add(b);
                list.get(num).add(a);
                list.get(num).add(b);
//            if (a != ('.')) {
//                list.get(num).add(a);
//            }
//            if (b != ('.')) {
//                list.get(num).add(b);
//            }
        }
        System.out.println("list = " + list);
        Arrays.fill(arr, ' ');
//        dfs(1);
        sb.append("\n");
        dfs2(1);
//        sb.append("\n");
//        dfs3(1);

        System.out.println("sb = " + sb);

    }

    public static void dfs(int start) {
        sb.append((char)(start + 'A' - 1));

        for (char newValue : list.get(start)) {
            int value = newValue - '0' - 16;
            dfs(value);
        }
    }

    public static void dfs2(int start) {
        if (list.get(start).get(0) == '.') {
            return;
        }
        dfs2(list.get(start).get(0) - 'A' + 1);
        sb.append((char)(start + 'A' + 1));
        dfs2(list.get(start).get(1) - 'A' + 1);
        return;

    }

    public static void dfs3(int start) {
        for (char newValue : list.get(start)) {
            int value = newValue - '0' - 16;
            dfs3(value);
            System.out.println("value = " + value);
        }
//        sb.append(newValue);
        sb.append((char)(start + 'A' - 1));
    }
}
