package 반복문.bronze.no10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int a = 0;
        int b = 0;
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            result[i] = a + b;
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
