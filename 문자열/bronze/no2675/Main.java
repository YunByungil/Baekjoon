package 문자열.bronze.no2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] r = new int[n];
        String[] s = new String[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            r[i] = Integer.parseInt(st.nextToken());
            s[i] = st.nextToken();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                for (int k = 0; k < r[i]; k++) {
                    System.out.print(s[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
