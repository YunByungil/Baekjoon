package 투포인터.골드.냅색문제_1450;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static int c;
    static List<Integer> aSum, bSum;
    static int cnt, idx;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // n 개의 물건을 갖고 있고
        arr = new int[n];

        c = Integer.parseInt(st.nextToken()); // c만큼 무게를 넣을 수 있는 가방

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) { // 물건의 무게
            arr[i] = Integer.parseInt(st.nextToken());
        }

        aSum = new ArrayList<>();
        bSum = new ArrayList<>();
        a(0, 0);
        b(n / 2, 0);

        Collections.sort(bSum);
        for (int i = 0; i < aSum.size(); i++) {
            idx = 0;
            search(0, bSum.size() - 1, aSum.get(i));
            cnt += idx + 1;
        }
        System.out.println(cnt);



        int answer = 0;
        System.out.println("answer = " + answer);


        for (Integer integer : aSum) {
            System.out.println("A = " + integer);
        }
        for (Integer integer : bSum) {
            System.out.println("B = " + integer);
        }
    }

    public static void search(int l, int r, int value) {
        while (l <= r) {
            int mid = (l + r) / 2;
            System.out.println("mid = " + mid);
            if (bSum.get(mid) + value <= c) {
                idx = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
    }

    public static void a(int i, int sum) {
        if (sum > c) {
            return;
        }

        if (i == n / 2) {
            aSum.add(sum);
            return;
        }

        a(i + 1, sum+arr[i]);
        a(i + 1, sum);
    }

    public static void b(int i, int sum) {
        if (sum > c) {
            return;
        }

        if (i == n) {
            bSum.add(sum);
            return;
        }

        b(i + 1, sum+arr[i]);
        b(i + 1, sum);
    }
}
