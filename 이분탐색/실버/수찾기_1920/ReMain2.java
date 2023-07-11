package 이분탐색.실버.수찾기_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReMain2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; // 내가 가진 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine()); // 찾아야 되는 숫자 개수
        int answer = 0; // 결과 개수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int result = binarySearch(arr, target);
            System.out.println(result);
        }

    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] > target) {
                end = mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return 0;
    }
}
