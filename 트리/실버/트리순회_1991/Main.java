package 트리.실버.트리순회_1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    public static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list.add(new ArrayList<>());
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = st.nextToken().charAt(0) - 'A';
            int a = st.nextToken().charAt(0) - 'A';
            int b = st.nextToken().charAt(0) - 'A';

            if (a == -19) {
                arr[num][0] = -1;
            } else {
                arr[num][0] = a;
            }

            if (b == -19) {
                arr[num][1] = -1;
            } else {
                arr[num][1] = b;
            }
        }

        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);



    }

    public static void preOrder(int start) {
        if (start == -1) {
            return;
        }

        System.out.print((char)(start + 'A'));
        preOrder(arr[start][0]);
        preOrder(arr[start][1]);
    }
    public static void inOrder(int start) {
        if (start == -1) {
            return;
        }

        inOrder(arr[start][0]);
        System.out.print((char)(start + 'A'));
        inOrder(arr[start][1]);
    }
    public static void postOrder(int start) {
        if (start == -1) {
            return;
        }

        postOrder(arr[start][0]);
        postOrder(arr[start][1]);
        System.out.print((char)(start + 'A'));
    }
}
