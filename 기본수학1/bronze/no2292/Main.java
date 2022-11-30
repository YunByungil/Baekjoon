package 기본수학1.bronze.no2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int range = 2;
        int count = 1;

        if (n == 1) {
            System.out.println(n);
        } else {
            while (range <= n) {
                range += 6 * count;
                count++;
            }
            System.out.println(count);
        }
    }
}
