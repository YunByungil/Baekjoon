package 문자열.bronze.no11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String number = br.readLine();

        for (int i = 0; i < n; i++) {
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
