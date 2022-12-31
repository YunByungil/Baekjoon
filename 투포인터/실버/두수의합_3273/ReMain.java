package 투포인터.실버.두수의합_3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // n개

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n]; // 배열
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 합

        /*
        배열에 있는 값들이 2개의 쌍을 이루어서 합이 x가 되어야 된다. 그 개수를 count
         */

        Arrays.sort(arr); // 배열을 오름차순으로 정렬하고 양 쪽 끝에서 출발하자.

        System.out.println(getCount(arr, x));

    }

    public static int getCount(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start < end) {
            if (arr[start] + arr[end] > x) {
                end--;
            } else if (arr[start] + arr[end] == x) {
                count++;
                end--;
            } else if (arr[start] + arr[end] < x) {
                start++;
            }
        }
        return count;

    }
}



