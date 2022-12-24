package 투포인터.실버.수들의합2_2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // 여기까지, 입력

        int start = 0; // 왼쪽 index
        int end = 0; // 오른쪽 index
        int count = 0; // K = 5일 때, count를 1개씩 증가
        int sum = 0;
        while (start < n && end < n) {
            sum = 0;
            for (int i = start; i <= end; i++) {
                sum += arr[i];
            }

            if (sum < k) {
                end++;
            } else if (sum > k) {
                start++;
            } else if (sum == k) {
                count++;
                end++;
            }
        } // 풀이는 블로그에 자세하게 써놓음

        System.out.println(count);
    }
}
