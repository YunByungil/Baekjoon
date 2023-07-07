package _바킹독_알고리즘.그리디.잃어버린_괄호_1541;

import java.util.*;
import java.io.*;

public class Fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String[] str = br.readLine().split("-");
        System.out.println(Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {

            int temp = 0;
            String[] arr = str[i].split("\\+");
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr[j] = " + arr[j]);
                temp += Integer.parseInt(arr[j]);
            }

            if (sum == 0) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }
}

