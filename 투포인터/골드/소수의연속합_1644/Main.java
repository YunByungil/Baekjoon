package 투포인터.골드.소수의연속합_1644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        // 2. 소수인지 아닌지 판별 ( 1은 소수가 아니다 )
        // 어떻게 판별할 수 있을까..?
        // 2로 나누었을 때, 나머지 1, 그럼 15같은 수는 어떻게 해결?
        // 에라토스테네스의 체 알고리즘을 이용하자
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= n; j+=i) {
                arr[j] = 0;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i != 0) {
                list.add(i);
            }
        }


        // 3. 소수가 아니라면 부분합을 이용해서 더함 (getNum 메서드)
        int count = getNum(list, n);
        System.out.println(count);

    }

    public static int getNum(List<Integer> list, int n) {
        int start = 0; // 시작
        int end = 0; // 끝
        int sum = 0;
        int count = 0;
        while (true) {
            if (sum >= n) {
                if (sum == n) {
                    count++;
                }
                sum -= list.get(start++);
            } else if (end == list.size()) {
                break;
            } else if (sum < n) {
                sum += list.get(end++);
            }
        }
        return count;
    }
}
