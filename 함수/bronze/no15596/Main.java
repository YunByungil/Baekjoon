package 함수.bronze.no15596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sumArr = new int[n];
        long test = sum(sumArr);

        System.out.println("test = " + test);
        
        

    }
    public static long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i <= a.length; i++) {
            ans += a[i];
        }

        return ans;
    }
}
