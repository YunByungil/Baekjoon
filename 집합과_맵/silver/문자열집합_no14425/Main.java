package 집합과_맵.silver.문자열집합_no14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. input 받기
        // n, m 그리고 s, check 값 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> s = new ArrayList<>();
        List<String> check = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s.add(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            check.add(st.nextToken());
        }

        // 2. check(list)에 있는 문자열들과 s를 비교한다.
        int result = 0;
        for (int i = 0; i < check.size(); i++) {
            if (s.contains(check.get(i))) {
                result++;
            }
        }

        // 3. 총 몇 개가 포함되어 있는지 출력
        System.out.println(result);
    }
}
