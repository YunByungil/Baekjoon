package _바킹독_알고리즘.그리디.동전0_11047;

import java.util.*;
import java.io.*;

public class Fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer += k / money[i];
            k = k % money[i];
        }

        System.out.println(answer);
    }
}

