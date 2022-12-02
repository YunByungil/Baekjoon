package 기본수학1.bronze.no10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        a = a.add(b);
        System.out.println(a);

//        int count = 0;
//        String str_A = st.nextToken();
//        String str_B = st.nextToken();
//
//        int maxLength = Math.max(str_A.length(), str_B.length());
//        int[] a = new int[maxLength + 1];
//        int[] b = new int[maxLength + 1];
//
//
//        for (int i = str_A.length() - 1; i >= 0; i--) {
//            a[count] = str_A.charAt(i) - '0';
//            count++;
//        }
//        count = 0;
//        for (int i = str_B.length() - 1; i >= 0; i--) {
//            b[count] = str_B.charAt(i) - '0';
//            count++;
//        }
//
//        for (int i = 0; i < maxLength; i++) {
//            int value = a[i] + b[i];
//            a[i] = value % 10;
//            a[i + 1] += (value / 10);
//        }
//
//        if (a[maxLength] != 0) {
//            System.out.print(a[maxLength]);
//        }
//
//        for (int i = maxLength - 1; i >= 0; i--) {
//            System.out.print(a[i]);
//        }
    }
}
