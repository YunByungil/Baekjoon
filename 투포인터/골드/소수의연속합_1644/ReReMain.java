package 투포인터.골드.소수의연속합_1644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 자연수 n
        int[] arr = new int [n + 1];
        List<Integer> list = new ArrayList<>();
        arr[0] = 0;
        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] != i) {
                continue;
            }
            for (int j = i + i; j <= n; j+=i) {
                arr[j] = 0;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] > 0) {
                list.add(arr[i]);
            }
        }

        int count = 0;
        count = getCount(list, n, count);

        System.out.println(count);



    }

    public static int getCount(List<Integer> list, int n, int count) {

        int start = 0;
        int end = 0;

        int sum = 0;
        while (true) {

            if (sum < n) {
                if (end == list.size()) {
                    break;
                }
                sum += list.get(end++);
            } else if (sum >= n) {
                if (sum == n) {
                    count++;
                }
                sum -= list.get(start++);
            }
        }


        return count;
    }
}
