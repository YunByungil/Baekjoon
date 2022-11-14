package 반복문.bronze.no2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
