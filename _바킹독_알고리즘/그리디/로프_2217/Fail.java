package _바킹독_알고리즘.그리디.로프_2217;

import java.util.*;
import java.io.*;

public class Fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int max = 0;

        for (int i = 1; i <= n; i++) {
            max = Math.max(max, arr[n - i] * i);
        }

        System.out.println("result = " + max);
    }
}

