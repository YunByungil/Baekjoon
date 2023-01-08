package 이분탐색.실버.랜선자르기_1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
        n개의 랜선을 만들어야 함
        내가 갖고있는 k개의 랜선으로 n개의 랜선을 만들어야 함.
        갖고있는 k개의 랜선을 잘라서 n개를 만들 수 있는 랜선의 최대 길이를 구하자.
        이분 탐색을 이용해서 해결하자

        802, 743, 457, 539 이렇게 랜선의 각가 길이가 주어지는데 어떻게 이분 탐색을 이용해서 최댓값을 구할 수 있을까?
        4개의 랜선으로 11개의 랜선을 만들어야 되는데
        가장 긴 랜선의 길이를 이분 탐색 알고리즘을 사용해서 최댓값을 구하는 문제

        802를 반으로 나누면 401이다.
        이 401로 각 랜선을 최대한 쪼갠 다음, 그 수가 11을 만족하는지 체크하면 된다.
         */

        int k = Integer.parseInt(st.nextToken()); // 갖고 있는 랜선의 개수 k
        int n = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수 n

        int[] arr = new int[k]; // 갖고 있는 랜선의 길이를 담는 배열
        long max = 0; // 갖고 있는 랜선 중 가장 긴 랜선의 길이
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        max++; // 길이가 1일 때 0으로 나누는 것을 막기 위함이다.

        long result = 0;
        long min = 0;
        long mid = 0;

        while (min < max) {
            result = 0;
            mid = (min + max) / 2;
            for (int i = 0; i < k; i++) {
                result += (arr[i] / mid);
            }

            if (result < n) { // mid값이 크기 때문에 max 값 을 줄여야 한다.
                max = mid;
            } else if (result == n) {
                min = mid + 1;
            } else if (result > n) {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
