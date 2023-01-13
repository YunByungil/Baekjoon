package 이분탐색.실버.숫자카드2_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReMain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 숫자 카드 n개

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n]; // n개를 갖고 있는 배열
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        /*
        이분 탐색을 사용할 땐 정렬 필수
        범위가 50만, 50만이기 때문에 2중 for문으로 해결할 수 없다.
         */

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 비교 카드 m개

        /*
        중복된 값을 허용하기 때문에
        index의 최솟값, index의 최댓값 + 1을 구해서 개수를 확인한다.
         */
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, num) - lowBound(arr, num)).append(" ");
        }
        System.out.println(sb);

    }

    public static int upperBound(int[] arr, int num) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > num) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int lowBound(int[] arr, int num) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= num) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
