package _바킹독_알고리즘.배열.알파벳_개수_10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String s; // 단어 s
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();

        arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int value = (int) (s.charAt(i) - 'a');
            arr[value]++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
