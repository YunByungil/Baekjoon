package 문자열.bronze.no1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int count = 1;
        for (int i = 1; i < word.length() - 1; i++) {
            if (word.charAt(i) == ' ') {
                count++;
            }
        }
        if (word.equals(" ")) {
            count = 0;
        }
        System.out.println(count);
    }
}
