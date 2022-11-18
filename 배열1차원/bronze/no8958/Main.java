package 배열1차원.bronze.no8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result = "";
        int count = 0;
        int resultScore = 0;
        int[] printResult = new int[n];
        for (int i = 0; i < n; i++) {
            result = br.readLine();
            for (int j = 0; j < result.length(); j++) {
                if ((result.charAt(j)) == 'O') {
                    count++;
                    resultScore += count;
                } else if (result.charAt(j) == 'X') {
                    count = 0;
                }
            }
            printResult[i] = resultScore;
            count = 0;
            resultScore = 0;
        }
        for (int i : printResult) {
            System.out.println(i);
        }
    }
}
