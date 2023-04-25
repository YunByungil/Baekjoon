package _바킹독_알고리즘.배열.숫자의_개수_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int a, b, c;
    public static int[] arr = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        String num = String.valueOf(a * b * c);

        for (int i = 0; i < num.length(); i++) {
            int index = num.charAt(i) - '0';
            arr[index]++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
