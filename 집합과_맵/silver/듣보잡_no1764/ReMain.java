package 집합과_맵.silver.듣보잡_no1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), 1);
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
//            map.put(str, map.getOrDefault(str, 0) + 1);
            if (map.containsKey(str)) {
                result++;
                map.put(str, 2);
            } else {
                map.put(str, 1);
            }
        }

        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) > 1) {
               list.add(s);
            }
        }
        Collections.sort(list);

        System.out.println(result);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
