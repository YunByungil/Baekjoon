package 배열1차원.bronze.no10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
        }
        System.out.println(min + " " + max);
    }
}
