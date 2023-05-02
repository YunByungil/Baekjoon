package _바킹독_알고리즘.기초_코드_작성_요령;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());

            if (input < x) {
                sb.append(input).append(" ");
            }
        }

        System.out.println(sb);
    }
}
