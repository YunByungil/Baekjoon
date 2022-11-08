package 입출력과_사칙연산.bronze.no2588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        int test1 = Integer.parseInt(num1) * (num2.charAt(2) - '0');
        int test2 = Integer.parseInt(num1) * (num2.charAt(1) - '0');
        int test3 = Integer.parseInt(num1) * (num2.charAt(0) - '0');
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
    }
}
