package _바킹독_알고리즘.배열.애너그램_만들기_1919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] arr1;
    public static int[] arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr1 = new int[26];
        arr2 = new int[26];
        String str1 = br.readLine();
        String str2 = br.readLine();

        for (int i = 0; i < str1.length(); i++) {
            int index = str1.charAt(i) - 'a';
            arr1[index]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) - 'a';
            if (arr1[index] != 0) {
                arr1[index]--;
            } else {
                arr2[index]++;
            }
        }
        int result = 0;
        for (int i : arr1) {
            if (i > 0) {
                result += i;
            }
        }

        for (int i : arr2) {
            if (i > 0) {
                result += i;
            }
        }

        System.out.println(result);

    }
}
