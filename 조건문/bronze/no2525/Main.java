package 조건문.bronze.no2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        int time = scanner.nextInt();

        if (m + time == 60) {
            h = h + 1;
            m = 0;
        } else if (m + time > 100) {
            h = h + (m + time) / 60;
            if (h > 24) {
                h -= 24;
            }
            m = (m + time) % 60;
        } else if (m + time > 60 && m + time < 100) {
            h = h + 1;
            m = m + time - 60;
        } else if (m + time < 60) {
            m = m + time;
        }
        if (h == 24) {
            h = 0;
        }
        System.out.print(h + " " + m);
    }
}
