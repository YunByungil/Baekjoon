package 배열1차원.bronze.no3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int check = 0;
        int[] result = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a = Integer.parseInt(br.readLine());
//            set.add(a % 42);
//        }
//        System.out.println(set.size());
//
        for (int i = 0; i < 10; i++) {
            a = Integer.parseInt(br.readLine());
            result[i] = a % 42;
        }
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] == result[j]) {
                    count = 0;
                    break;
                } else {
                    count++;
                }
            }
            if (count != 0) {
                check++;
                count = 0;
            }
        }
        System.out.println(check + 1);
    }
}
