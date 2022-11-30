package 재귀.gold.no2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(getStar(n));
    }

    public static String getStar(int n) {
        System.out.print("*");
        count++;
        if (count == (n/2)) {
            return "d ";
        }
        return getStar(n);
    }
}
