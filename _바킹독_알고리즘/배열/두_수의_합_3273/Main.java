package _바킹독_알고리즘.배열.두_수의_합_3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int n; // 수열의 크기 n
    public static int[] arr; // 배열
    public static int x; // 배열에서 2개 더한 값이 x가 나와야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        n의 범위가 100_000이기 때문에 2중 for문을 사용하면 1초가 넘어서 시간초과!
        투 포인터 알고리즘으로 해결하면 된다.
         */
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        x = Integer.parseInt(br.readLine());

        int start = 0;
        int end = n - 1;

        int result = 0;

        while (start < end) {
            int value = arr[start] + arr[end];

            if (value < x) {
                start++;
            } else if (value == x) {
                result++;
                end--;
            } else if (value > x) {
                end--;
            }
        }

        System.out.println(result);

    }
}
