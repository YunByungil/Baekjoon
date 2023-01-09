package 투포인터.골드.두용액_2470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 용액의 수 n

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n]; // 용액을 담는(온도) 배열
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;

        int resultS = 0;
        int resultE = 0;

        int minTemperature = Integer.MAX_VALUE;
        int nowTemperature = 0;
        int check = 0;

        while (start < end) {

            nowTemperature = arr[start] + arr[end];
            check = Math.abs(nowTemperature);

            if (minTemperature >= check) {
                minTemperature = check;
                resultS = start;
                resultE = end;
            }
            if (nowTemperature == 0) {
                break;
            } else if (nowTemperature > 0) {
                end--;
            } else if (nowTemperature < 0) {
                start++;
            }
        }
        System.out.println(arr[resultS] + " " + arr[resultE]);

    }
}
