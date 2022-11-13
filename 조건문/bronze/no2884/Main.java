package 조건문.bronze.no2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int resultM = m - 45;
        if (resultM < 0) {
            h = h - 1;
            resultM = resultM + 60;
        }
        if (h < 0) {
            h = 23;
        }

        System.out.println(h + " " + resultM);


    }
}
