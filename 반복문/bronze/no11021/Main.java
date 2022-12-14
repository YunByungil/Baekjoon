package 반복문.bronze.no11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String sum = br.readLine();
            int a = Integer.parseInt(sum.split(" ")[0]);
            int b = Integer.parseInt(sum.split(" ")[1]);
            sb.append("Case #" + i + ": " + (a+b)).append('\n');
        }
        System.out.println(sb);
    }
}
