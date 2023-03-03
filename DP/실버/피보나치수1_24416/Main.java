package DP.실버.피보나치수1_24416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, count;
    public static int[] dp, arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        fib(n);
        System.out.print(count + " ");
        count = 0;
        test(n);
        System.out.print((count - 1));
//        fibonacci(n);
    }
    
    public static int test(int n) {
        dp[0] = 0;
        dp[1] = 1;
        if (dp[n] == -1) {
            count++;
            dp[n] = test(n - 1) + test(n - 2);
        }
        return dp[n];
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            count++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibonacci(int n) {
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            System.out.println("check");
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("arr[n] = " + arr[n]);
        return arr[n];
    }
}
