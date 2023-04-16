package a처음부터_다시푸는_백준.브론즈.조건문.시험성적_9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if (score / 10 >= 9) {
            System.out.println("A");
        } else if (score / 10 == 8) {
            System.out.println("B");
        } else if (score / 10 == 7) {
            System.out.println("C");
        } else if (score / 10 == 6) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
