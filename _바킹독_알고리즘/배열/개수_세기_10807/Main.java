package _바킹독_알고리즘.배열.개수_세기_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n; // 정수의 개수 n
    public static int[] arr;
    public static int v; // 찾으려고 하는 정수 v

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        v = Integer.parseInt(br.readLine());

        int result = 0;
        for (int num : arr) {
            if (num == v) {
                result++;
            }
        }

        System.out.println(result);
    }
}
