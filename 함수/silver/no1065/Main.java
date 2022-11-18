package 함수.silver.no1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String test = "";
        int num = 0;

        for (int i = 1 ; i <= n; i++) {
            test = "" + i;
            if (test.length() <= 2) {
                count++;
            } else if (test.length() > 2) {
                num = (test.charAt(1) - '0') - (test.charAt(0) - '0');
                for (int j = 2; j < test.length(); j++) {
                    if (num == test.charAt(j) - test.charAt(j - 1)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
