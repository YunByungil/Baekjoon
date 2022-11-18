package 정렬.silver.no1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());
        String test = "" + num;
        for (int i = 0; i < test.length(); i++) {
            numbers.add(test.charAt(i) - '0');
        }
        Collections.sort(numbers, Collections.reverseOrder());
        for (Integer number : numbers) {
            System.out.print(number);
        }
        // 다른 방법
        char[] num2 = br.readLine().toCharArray();

        Arrays.sort(num2);
        for (int i = num2.length - 1; i >= 0; i--) {
            System.out.print(num2[i]);
        }
    }
}
