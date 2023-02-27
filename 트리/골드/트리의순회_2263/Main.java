package 트리.골드.트리의순회_2263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int idx;
    public static int[] arr;
    public static int[] inOrder;
    public static int[] postOrder;

    public static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        inOrder = new int[n];
        postOrder = new int[n];
        arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inOrder[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            postOrder[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            arr[inOrder[i]] = i;
            System.out.println("inOrder = " + inOrder[i]);
            System.out.println("i = " + i);
        }

        dfs(0, n - 1, 0, n -1);
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("sb = " + sb);

    }

    public static void dfs(int startInOrder, int endInOrder, int startPostOrder, int endPostOrder) {

        if (startInOrder > endInOrder || startPostOrder > endPostOrder) {
            return;
        }

        int root = postOrder[endPostOrder]; // root 값
        sb.append(root).append(" ");

        // 중위 순회에서 루트의 인덱스 구하기
        int rootIdx = arr[root];

        // 중위 순회에서 루트 기준 왼쪽의 노드 개수
        int left = rootIdx - startInOrder;

        System.out.println("(rootIdx - 1) = " + (rootIdx - 1));
        dfs(startInOrder, rootIdx - 1, startPostOrder, startPostOrder + left - 1);

        dfs(rootIdx + 1, endInOrder, startPostOrder + left, endPostOrder - 1);


    }
}
