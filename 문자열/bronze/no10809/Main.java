package 문자열.bronze.no10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        String s = br.readLine();

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (alphabet[i] == s.charAt(j)) {
                    System.out.print(j + " ");
                    break;
                }
                if (j == s.length() - 1) {
                    System.out.print(-1 + " ");
                }
            }
        }
    }
}
