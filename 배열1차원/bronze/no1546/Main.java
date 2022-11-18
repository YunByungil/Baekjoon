package 배열1차원.bronze.no1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        double[] result = new double[n];
        double sum = 0;
        double max = 0;
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
             score[i] = Integer.parseInt(st.nextToken());
             max = Math.max(max, score[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = (score[i] / max) * 100;
        }

        for (double v : result) {
            sum += v;
        }
        double avg = sum / n;
        System.out.println(avg);
    }
}
