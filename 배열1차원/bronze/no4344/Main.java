package 배열1차원.bronze.no4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] student = new int[n];
        List<Double> test = new ArrayList<>();
        List<Integer> test2 = new ArrayList<>();
        String str = "";
        int check = 0;
        int count = 0;
        double avg = 0;
        double sum = 0;
        double result = 0;

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            check = Integer.parseInt(str.split(" ")[0]);
            student = new int[check];

            for (int j = 0; j < check; j++) {
                student[j] = Integer.parseInt(str.split(" ")[j + 1]);
                sum += student[j];
            }
            avg = sum / check;

            for (int k = 0; k < check; k++) {
                if (student[k] > avg) {
                    count++;
                }
            }

            test.add(((double)count / check) * 100);
            sum = 0;
            count = 0;
        }

        for (Double aDouble : test) {
            System.out.println(String.format("%.3f", aDouble) + "%");
        }
    }
}
