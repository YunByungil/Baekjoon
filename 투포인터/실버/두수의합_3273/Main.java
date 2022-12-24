package 투포인터.실버.두수의합_3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 수열의 크기 n
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 수열에 포함되는 수 m
        }
        Arrays.sort(arr);
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 자연수 x
        // x를 만족하는 쌍의 개수를 출력한다.

        int start = 0;
        int end = n - 1;
        int sum = 0;
        int count = 0;

        while (start < end) {

            sum = arr[start] + arr[end];

            if (sum < x) {
                start++;
            } else if (sum == x) {
                end--;
                count++;
            } else if (sum > x) {
                end--;
            }
        }

        System.out.println(count);
    }
}
