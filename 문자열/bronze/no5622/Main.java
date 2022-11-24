package 문자열.bronze.no5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] words = {
                {"A", "B", "C", "3"},
                {"D", "E", "F", "4"},
                {"G", "H", "I", "5"},
                {"J", "K", "L", "6"},
                {"M", "N", "O", "7"},
                {"P", "Q", "R", "S", "8"},
                {"T", "U", "V", "9"},
                {"W", "X", "Y", "Z", "10"},
        };
        String str = br.readLine();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                for (int k = 0; k < str.length(); k++) {
                    if (words[i][j].equals(""+str.charAt(k))) {
                        count += Integer.parseInt(words[i][words[i].length - 1]);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
