package 반복문.bronze.no10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean result = true;
        int end = 0;
        while (result) {
            String basket = br.readLine();
            int a = Integer.parseInt(basket.split(" ")[0]);
            int b = Integer.parseInt(basket.split(" ")[1]);
            if (a + b == end) {
                result = false;
            } else if (a + b != end) {
                sb.append(a + b).append('\n');
            }
        }
        System.out.println(sb);
    }
}
