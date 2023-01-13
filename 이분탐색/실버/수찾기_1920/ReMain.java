package 이분탐색.실버.수찾기_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReMain {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        N개의 정수 a[1], a[2], ... a[n]이 주어졌을 때,
        X라는 정수가 존재하는지 확인하는 문제
        */

        // 1. input
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n]; // n개의 정수를 담는 배열 ( a )
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        /*
        2. 내가 입력한 m개의 숫자들이 arr배열에 있는지 확인하면 된다.
        범위가 10만이기 때문에 시간 복잡도를 고려해서 이분 탐색으로 해결
         */

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int answer = checkNumber(arr, Integer.parseInt(st.nextToken()));
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    public static int checkNumber(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        int result = 0;
        
        while (start <= end) {
            int mid = (start + end) / 2;

            System.out.println("start = " + start);
            System.out.println("end = " + end);

            System.out.println("arr[mid] = " + arr[mid]);
            
            if (arr[mid] == num) {
                result = 1;
                break;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            }
        }
        
        return result;
    }
}
