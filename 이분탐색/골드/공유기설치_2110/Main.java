package 이분탐색.골드.공유기설치_2110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.dgc.VMID;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 집의 개수 n
        int c = Integer.parseInt(st.nextToken()); // 공유기의 개수 c

        arr = new int[n]; // 집의 좌표를 담는 배열
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int check = 0;
            int mid = (start + end) / 2;

            if (can(mid) < c) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start - 1);

    }

    public static int can(int num) {
        int count = 1;
        int lastLocate = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int locate = arr[i];

            if (locate - lastLocate >= num) {
                count++;
                lastLocate = locate;
            }
        }

        return count;
    }
}
