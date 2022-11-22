package 문자열.bronze.no1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();
        char ch = ' ';
        int[] count = new int[26];
        int max = 0;

        int test = 0;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);

            count[ch - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                ch = (char) (i + 'A');
            } else if (count[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
