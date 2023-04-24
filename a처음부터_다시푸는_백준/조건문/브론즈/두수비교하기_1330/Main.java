package a처음부터_다시푸는_백준.조건문.브론즈.두수비교하기_1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else if (a < b) {
            System.out.println("<");
        }
    }
}
