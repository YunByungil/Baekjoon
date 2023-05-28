package _바킹독_알고리즘.정렬.빈도_정렬_2910;

import java.util.*;
import java.io.*;

public class Main {
    public static int n, c;
    public static Map<Integer, Integer> map = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(map.get(b), map.get(a));
            }
        });

        for (Integer l : list) {
            for (int i = 0; i < map.get(l); i++) {
                System.out.println(l);
            }
        }

    }
}
