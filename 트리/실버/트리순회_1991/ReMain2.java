package 트리.실버.트리순회_1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReMain2 {
    public static int n;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int location = st.nextToken().charAt(0) - 'A';
            int left = st.nextToken().charAt(0) - 'A';
            int right = st.nextToken().charAt(0) - 'A';

            if (left == -19) {
                arr[location][0] = -1;
            } else {
                arr[location][0] = left;
            }

            if (right == -19) {
                arr[location][1] = -1;
            } else {
                arr[location][1] = right;
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
        System.out.print((char) (start + 'A'));
        preOrder(arr[start][0]);
        preOrder(arr[start][1]);
    }

    public static void inOrder(int start) {
        if (start == -1) {
            return;
        }

        inOrder(arr[start][0]);
        System.out.print((char) (start + 'A'));
        inOrder(arr[start][1]);
    }

    public static void postOrder(int start) {
        if (start == -1) {
            return;
        }

        postOrder(arr[start][0]);
        postOrder(arr[start][1]);
        System.out.print((char) (start + 'A'));
    }
}
