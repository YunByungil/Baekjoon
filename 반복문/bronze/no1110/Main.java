package 반복문.bronze.no1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean result = true;
        int count = 0;
        String num = br.readLine();
        int newNum = 0;
        int temp = 0;
        int temp2 = 0;
        if (num.length() == 2) {
            for (int i = 0; i < num.length(); i++) {
                newNum += num.charAt(i) - '0';
            }
            temp = num.charAt(0) - '0';
            temp2 = num.charAt(1) - '0';
        } else if (num.length() == 1) {
            temp = 0;
            temp2 = num.charAt(0) - '0';
            newNum = temp + temp2;
        }

        int basket = 0;
        while (result) {
            count++;

            if (newNum >= 10) {
                basket = Integer.parseInt((temp2 + "" + (newNum % 10)));
                temp = temp2;
                temp2 = (newNum % 10);
                newNum = temp + temp2;
            } else if (newNum < 10) {
                basket = Integer.parseInt((temp2 + "" + newNum));
                temp = temp2;
                temp2 = newNum;
                newNum = temp + temp2;
            }
            if (basket == Integer.parseInt(num)) {
                result = false;
            }
        }
        System.out.println(count);
    }
}
