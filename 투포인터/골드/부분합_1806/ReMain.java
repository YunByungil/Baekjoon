package 투포인터.골드.부분합_1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 수열 n개
        int s = Integer.parseInt(st.nextToken()); // 합 s

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n]; // n개를 담은 배열 arr
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /*
        연속된 수들의 부분합 중에서 s 이상인 것을 체크하고,
        가장 짧은것의 길이를 구하면 된다.
         */

        int minLength = Integer.MAX_VALUE; // 최소 길이
        minLength = check(arr, n, s, minLength);
        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }

    }

    public static int check(int[] arr, int n, int s, int minLength) {

        int start = 0;
        int end = 0;

        int sum = 0;
        while (end <= n) {
//            System.out.println("start = " + start);
//            System.out.println("end = " + end);
//            System.out.println("sum = " + sum);
            if (sum < s) {
                if (end == n) {
                    break;
                }
                sum += arr[end++];
            } else if (sum >= s) {
                minLength = Math.min(minLength, (end - start));
                sum -= arr[start++];
            }

//            System.out.println(sum);
        }

        return minLength;
    }
}
