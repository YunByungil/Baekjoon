package DP.플래티넘.전구_2449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;
    public static int[] arr;
    public static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 전구의 개수
        int k = Integer.parseInt(st.nextToken()); // 전구가 표현할 수 있는 색의 개수
        arr = new int[n]; // 전구들 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            dfs(n, i, 1, 2);
        }
//        dfs(n, 0, 2, 3);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("count : " + count);


    }
    // change : 내가 바꾸려고 하는 수
    // check : 내가 바꾸려고 하는 index
    // k : 원래 그 index의 값


    public static void dfs(int n, int check, int k, int change) {
        if (map.containsKey(check)) {
            if (map.get(check) == change) {
                return;
            }
        }
        map.put(check, change);
        System.out.println("check : " + check);
        // 탈출 조건
        if (check < 0 || check == n) {
            return;
        }

        if (arr[check] == k) {
            count++;
            arr[check] = change;
        } else {
//            count--;
            return;
        }


        dfs(n, check - 1, k, change);
        dfs(n, check + 1, k, change);
    }

    public static void changeNum() {

    }
}
