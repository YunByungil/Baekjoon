package 투포인터.골드.냅색문제_1450;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReMain {
    public static int n, c;
    public static int[] arr;
    public static List<Integer> a;
    public static List<Integer> b;
    public static int index, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // n개의 물건을 갖고 있음
        c = Integer.parseInt(st.nextToken()); // c만큼의 무게를 넣을 수 있음

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
//
//        // 반으로 나누어서 재귀를 이용한 무게 측정.
        a = new ArrayList<>();
        b = new ArrayList<>();
        checkA(0, 0);
        checkB(n / 2, 0);
        Collections.sort(b);


        for (int i = 0; i < a.size(); i++) {
            search(0, b.size() - 1, a.get(i));
            count += index + 1;
        }

        System.out.println(count);
    }

    public static void search(int l, int r, int aNum) {
        while (l <= r) {
            int mid = (l + r) / 2;

            if (b.get(mid) + aNum <= c) {
                index = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
    }

    public static void checkA(int i, int sum) {
        if (sum > c) {
            return;
        }

        if (i == n / 2) {
            if (sum <= c) {
                a.add(sum);
            }
            return;
        }

        checkA(i + 1, sum);
        checkA(i + 1, sum + arr[i]);
    }

    public static void checkB(int i, int sum) {
        if (sum > c) {
            return;
        }

        if (i == n) {
            if (sum <= c) {
                b.add(sum);
            }
            return;
        }

        checkB(i + 1, sum);
        checkB(i + 1, sum + arr[i]);
    }
}
