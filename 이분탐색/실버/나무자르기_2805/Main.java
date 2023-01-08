package 이분탐색.실버.나무자르기_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
        나무 M미터가 필요하다.
        1. 절단기에 높이 H를 지정
        나무의 높이가 20, 15, 10, 17로 가정하자
        H가 15라면? 일자로 쭉 자르니까, 15, 15, 10, 15가 될 것이고
        상근이는 길이가 5인 나무와 길이가 2인 나무를 들고 집에 간다. (총 7미터)
        => 절단기의 높이대로 일자로 쭉 자르니까 낮거나 같으면 잘리지 않고, 높은 나무만 잘린다.

        필요한 만큼만 갖고갈 때, (M미터의 나무) 절단기의 최대 높이는?
         */

        int n = Integer.parseInt(st.nextToken()); // 나무의 개수 n
        int m = Integer.parseInt(st.nextToken()); // 필요한 나무(길이) m
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n]; // 나무의 길이를 담는 배열 (n개)
        long min = 0; // 절단기의 시작 값
        long max = 0; // 절단기의 시작 값 구하기 (중간)
        long cut = 0; // 절단기
        long tree = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            //min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        // 적어도 M미터를 갖고오기 위한 절단기의 최대 높이를 구하기
        while (min < max) {
            tree = 0;
            cut = (max + min) / 2;
            for (int i = 0; i < n; i++) {
                long count = arr[i] - cut;
                if (count > 0) {
                    tree += count;
                }
            }
            if (tree == m) {
                min = cut + 1;
                break;
            } else if (tree > m) { // 나무가 많이 남는다는 뜻이므로 절단기를 올려야 된다. 최솟값 키우기
                min = cut + 1;
            } else if (tree < m) { // 나무가 부족하니까 절단기 높이 줄여야 됨 최댓값 낮추기
                max = cut;
            }
        }
        System.out.println(min - 1);
    }
}
