package 이분탐색.실버.랜선자르기_1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선의 개수 k
        int n = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수 n

        int[] arr = new int[k];

        long max = 0;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        max++;

        long mid = 0;
        long min = 0;

        long result = 0;

        while (min < max) {
            mid = (min + max) / 2;

            long count = 0;

            for (int i = 0; i < k; i++) {
                count += arr[i] / mid;
            }

            if (count == n) {
                min = mid + 1;
                result = min;
            } else if (count > n) {
                min = mid + 1;
            } else if (count < n) {
                max = mid;
            }
        }

        System.out.println((result - 1));
    }
}
