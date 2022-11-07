package 입출력과_사칙연산.bronze.no3003;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int b = 1;
        int c = 2;
        int d = 2;
        int e = 2;
        int f = 8;
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
        a = 1 - Integer.parseInt(st.nextToken());
        b = 1 - Integer.parseInt(st.nextToken());
        c = 2 - Integer.parseInt(st.nextToken());
        d = 2 - Integer.parseInt(st.nextToken());
        e = 2 - Integer.parseInt(st.nextToken());
        f = 8 - Integer.parseInt(st.nextToken());

        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d + " ");
        System.out.print(e + " ");
        System.out.print(f + " ");
    }
}
