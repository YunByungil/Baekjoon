package _바킹독_알고리즘.배열.Strfry_11328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n; // 테스트 케이스
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean answer = false;
            arr = new int[26];
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            for (int j = 0; j < str1.length(); j++) {
                int index = str1.charAt(j) - 'a';
                arr[index]++;
            }

            for (int k = 0; k < str2.length(); k++) {
                int index = str2.charAt(k) - 'a';
                arr[index]--;
            }

            for (int result : arr) {
                if (result != 0) {
                    answer = true;
                    break;
                }
            }

            if (answer) {
                System.out.println("Impossible");
            } else {
                System.out.println("Possible");
            }
        }

    }

}
