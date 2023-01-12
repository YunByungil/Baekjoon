package 투포인터.골드.냅색문제_1450;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReReMain2 {
    public static int n, c;
    public static int[] arr;
    public static List<Integer> left;
    public static List<Integer> right;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 물건 n개
        c = Integer.parseInt(st.nextToken()); // 최대 무게 c

        st = new StringTokenizer(br.readLine());

        arr = new int[n]; // 물건 n개를 담는 배열 (무게)
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        left = new ArrayList<>();
        right = new ArrayList<>();

        leftBag(0, 0);
        rightBag(n / 2, 0);
        Collections.sort(right);

        int result = 0;
        for (int i = 0; i < left.size(); i++) {
            result += check(left.get(i), c);
        }

        System.out.println(result);
    }

    public static int check(int leftNumber, int c) {
        int start = 0;
        int end = right.size();
        
        while (start < end) {

            int mid = (start + end) / 2;

            if (leftNumber + right.get(mid) > c) {
                end = mid;
            } else if (leftNumber + right.get(mid) <= c) {
                start = mid + 1;
            }

        }

        return start;
    }


    public static void leftBag(int index, int sum) {
        if (sum > c) {
            return;
        }

        if (index == n / 2) {
            left.add(sum);
            return;
        }

        leftBag(index + 1, sum);
        leftBag(index + 1, arr[index] + sum);
    }

    public static void rightBag(int index, int sum) {
        if (sum > c) {
            return;
        }

        if (index == n) {
            right.add(sum);
            return;
        }

        rightBag(index + 1, sum);
        rightBag(index + 1, arr[index] + sum);
    }
}
