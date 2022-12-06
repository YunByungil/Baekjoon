package 브루트포스.bronze.no2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] card = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        // n = 5, 배열에 5개의 값을 넣는 거
        // m = 21, 21을 넘지 않고 5개의 값으로 숫자 3개 조합해서 21과 가장 근접한 수를 만드는 거

        /*
        0, 1, 2 조합
        0, 1, 3 조합
        0, 1, 4 조합
        1, 2, 3 조합
        1, 2, 4 조합
        2, 3, 4 조합
        */

        int max = 0;
        for (int i = 0; i < card.length - 2; i++) {
            for (int j = i + 1; j < card.length - 1; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    if (card[i] + card[j] + card[k] <= m) {
                        max = Math.max(max, card[i] + card[j] + card[k]);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
