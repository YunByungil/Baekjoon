package _바킹독_알고리즘.이분탐색.숫자_카드2_10816;

import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int[] arr, answer;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        answer = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch2(num) - binarySearch(num)).append(" ");
        }

        System.out.println(sb);
    }

    public static int binarySearch(int num) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > num) {
                end = mid;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] == num) {
                end = mid;
            }
        }

        return start;
    }

    public static int binarySearch2(int num) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > num) {
                end = mid;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] == num) {
                start = mid + 1;
            }
        }

        return start;
    }
}

