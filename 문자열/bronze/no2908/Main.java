package 문자열.bronze.no2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String reverseA = "";
        String reverseB = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverseA += a.charAt(i);
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            reverseB += b.charAt(i);
        }
        System.out.println(Math.max(Integer.parseInt(reverseA), Integer.parseInt(reverseB)));
    }
}
