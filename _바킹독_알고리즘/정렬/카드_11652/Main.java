package _바킹독_알고리즘.정렬.카드_11652;

// "static void main" must be defined in a public class.
import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static Map<Long, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int max = 0;
        long x = 0;

        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > max) {
                max = map.get(num);
                x = num;
            } else if (map.get(num) == max) {
                x = Math.min(num, x);
            }
        }

        System.out.println(x);



    }
}
