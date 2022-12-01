package 기본수학1.bronze.no1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int sum = 0;
        int crossCount = 0;
        int num = 0;

        // crossCount 가 몇인지 구하기
        while (true) {  // 내가 10을 입력했다고 가정해보자, 그 이전까지의 합을 구한 후에 10범위보다 커지면 종료
            crossCount++;
            sum = crossCount * (crossCount + 1) / 2;
            if (x <= sum) {
                break;
            }
        }

        // 그 행에서 몇 번째 값인지 구하기
        num = x - (crossCount * (crossCount - 1) / 2);

        // 짝수행인지 홀수행인지 구하기
        // 짝수일 때는 분모가 먼저 더 크다. ( 역방향 )
        if (crossCount % 2 == 0) {
            System.out.println(num + "/" + (crossCount - num + 1));
        } else {
            System.out.println((crossCount - num + 1) + "/" + num);
        }
    }
}
