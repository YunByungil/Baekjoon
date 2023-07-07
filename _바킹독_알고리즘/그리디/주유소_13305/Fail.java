package _바킹독_알고리즘.그리디.주유소_13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        long[] money = new long[n];
        long[] dis = new long[n - 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < dis.length; i++) {
            dis[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < money.length; i++) {
            money[i] = Long.parseLong(st.nextToken());
        }

        long result = money[0] * dis[0];
        long index = money[0];
        for (int i = 1; i < dis.length; i++) {
            index = Math.min(index, money[i]);
            result += index * dis[i];
        }

        System.out.println(result);
    }
}
