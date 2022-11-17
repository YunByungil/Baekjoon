package 배열1차원.bronze.no10807;

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
        for (int i = 0; i < n; i ++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int findNum = Integer.parseInt(br.readLine());
        int count = 0;
        for (int numbers : num) {
            if (numbers == findNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
