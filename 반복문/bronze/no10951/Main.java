package 반복문.bronze.no10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String basket = "";
        while ((basket = br.readLine()) != null && !basket.isEmpty()) {
            int a = Integer.parseInt(basket.split(" ")[0]);
            int b = Integer.parseInt(basket.split(" ")[1]);
            sb.append(a + b).append('\n');
        }
        System.out.println(sb);
    }
}
