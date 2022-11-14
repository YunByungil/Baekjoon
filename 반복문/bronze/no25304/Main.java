package 반복문.bronze.no25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long totalMoney = scanner.nextLong();
        int productCount = scanner.nextInt();
        int product = 0;
        int[] productCountCheck = new int[productCount * 2];
        int totalMoneyCheck = 0;


        for (int i = 0; i < productCount * 2; i++) {
            product = scanner.nextInt();
            productCountCheck[i] = product;
        }

        for (int i = 0; i < productCountCheck.length; i+= 2) {
            totalMoneyCheck += productCountCheck[i] * productCountCheck[i + 1];
        }

        if (totalMoney == totalMoneyCheck) {
            System.out.println("Yes");
        } else if (totalMoney != totalMoneyCheck) {
            System.out.println("No");
        }
    }
}
