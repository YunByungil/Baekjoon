package b전체문제.실버.수이어가기_2635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int n, m;
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = n;
        int n2 = 62;
        int result = 0;
        int answer = 0;
        int max = 0;
        int check = 0;

        if (n <= 0) {
            System.out.println(0);
        } else {
            for (int i = n; i >= n/2; i--) {
                int num = find(i);
                if (max < num) {
                    max = num;
                    check = i;
                }
            }

            find2(check);
            System.out.println(list.size());
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }

    }
    public static int find(int n2) {
        n = m;
        int result = 0;
        int count = 0;

        for (int i = 0; i < 100; i++) {
            result = n - n2;
            if (result < 0) {
                break;
            }
            count++;
            n = n2;
            n2 = result;
        }
        return count;
    }

    public static void find2(int n2) {
        n = m;
        list.add(n);
        list.add(n2);
        int result = 0;
        int count = 0;

        for (int i = 0; i < 100; i++) {
            result = n - n2;
            if (result < 0) {
                break;
            }
            list.add(result);
            n = n2;
            n2 = result;
        }
    }
}
