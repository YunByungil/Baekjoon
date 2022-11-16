package 반복문.bronze.no15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean result = true;
        int count = 0;

        while(result) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            count++;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append('\n');
            if (count == n) {
                result = false;
            }
        }
        System.out.println(sb);
    }
}
