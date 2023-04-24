package a처음부터_다시푸는_백준.입출력과_사칙연산.브론즈.입출력_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        for (int i = 2; i >= 0; i--) {
            System.out.println(a * (b.charAt(i) - '0'));
        }

        System.out.println(a * Integer.parseInt(b));
    }
}
