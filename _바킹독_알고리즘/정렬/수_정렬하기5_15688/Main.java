package _바킹독_알고리즘.정렬.수_정렬하기5_15688;

// "static void main" must be defined in a public class.
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] count = new int[20000001];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num + 1000000]++;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append(i - 1000000).append("\n");
                count[i]--;
            }
        }

        System.out.println(sb);
    }
}
