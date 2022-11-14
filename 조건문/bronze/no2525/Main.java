package 조건문.bronze.no2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        int time = scanner.nextInt();

        int temp = (60 * h) + m + time; // 현재 시간을 분으로 바꾸는 작업 -> 시간에 60을 곱하면 분으로 표현할 수 있음
        int hour = temp / 60;
        if (hour >= 24) {
            hour -= 24;
        }
        int minute = temp % 60;
        System.out.println(hour + " " + minute);
    }
}
