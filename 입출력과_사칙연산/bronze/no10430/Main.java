package 입출력과_사칙연산.bronze.no10430;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int test1 = (a + b) % c;
        int test2 = ((a % c) + (b % c)) % c;
        int test3 = (a * b) % c;
        int test4 = ((a % c) * (b % c)) % c;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

    }
}
