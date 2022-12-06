package 브루트포스.bronze.no2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        // m의 분해합이 n인 경우 m을 n의 생성자라고 한다.
        // 245의 분해합은 256 ( 245 + 2 + 4 + 5 )
        // 따라서 256의 생성자는 245다.

        // 198의 분해합 216
        // 198은 216의 생성자

        int[] arr = new int[1000001];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int n = Integer.parseInt(br.readLine());
        String result = "";
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            result = "" + arr[i];
            check = arr[i];
            for (int j = 0; j < result.length(); j++) {
                check += result.charAt(j) - '0';
                if (check == n) {
                    list.add(arr[i]);
                }
            }
        }

        Collections.sort(list);
        if (list.size() == 0) {
            System.out.println(0);
        } else if (list.size() != 0) {
            System.out.println(list.get(0));
        }
    }
}

