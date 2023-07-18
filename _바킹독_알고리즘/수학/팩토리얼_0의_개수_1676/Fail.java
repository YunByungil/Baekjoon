package _바킹독_알고리즘.수학.팩토리얼_0의_개수_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        System.out.println(count);
    }
}
