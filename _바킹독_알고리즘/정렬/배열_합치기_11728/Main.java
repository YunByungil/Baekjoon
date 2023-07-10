package _바킹독_알고리즘.정렬.배열_합치기_11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int[] c = new int[n + m];

        int aidx = 0;
        int bidx = 0;
        for (int i = 0; i < n + m; i++) {
            if (aidx == n) {
                c[i] = b[bidx++];
            } else if (bidx == m) {
                c[i] = a[aidx++];
            } else if (a[aidx] <= b[bidx]) {
                c[i] = a[aidx++];
            } else if (a[aidx] > b[bidx]) {
                c[i] = b[bidx++];
            }
        }

        for (int i : c) {
            System.out.println("i = " + i);
        }

    }
}
