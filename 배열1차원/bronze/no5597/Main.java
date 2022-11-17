package 배열1차원.bronze.no5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[30];
        int[] num = new int[28];
        int[] no = new int[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (students[i] == num[j]) {
                    students[i] = 0;
                }
            }
        }
        int count = 0;
        for (int student : students) {
            if (student > 0) {
                no[count] = student;
                count++;
            }
        }
        if (no[0] < no[1]) {
            System.out.println(no[0]);
            System.out.println(no[1]);
        } else {
            System.out.println(no[1]);
            System.out.println(no[0]);
        }
    }
}
