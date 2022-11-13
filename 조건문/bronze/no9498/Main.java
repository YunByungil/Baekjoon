package 조건문.bronze.no9498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        int avg = score / 10;
        if (9 <= avg && avg <= 10) {
            System.out.println("A");
        } else if (avg == 8) {
            System.out.println("B");
        } else if (avg == 7) {
            System.out.println("C");
        } else if (avg == 6) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
